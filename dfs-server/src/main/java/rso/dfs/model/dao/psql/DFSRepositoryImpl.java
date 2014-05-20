package rso.dfs.model.dao.psql;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rso.dfs.model.File;
import rso.dfs.model.FileOnServer;
import rso.dfs.model.Server;
import rso.dfs.model.ServerRole;
import rso.dfs.model.dao.DFSModelDAO;
import rso.dfs.model.dao.DFSRepository;

/**
 * Master and Shadows repository
 * 
 * @author Adam Papros <adam.papros@gmail.com>
 * */
public class DFSRepositoryImpl implements DFSRepository {

	final static Logger log = LoggerFactory.getLogger(DFSRepository.class);

	/**
	 * Information about master server.
	 * */
	private Server master;
	
	/**
	 * Master's DAO.
	 * */
	private DFSModelDAO masterDAO;
	
	/**
	 * Collection for shadows 
	 * */
	private HashMap<Server, DFSModelDAO> shadowsMap;
	

	public DFSRepositoryImpl(Server master) {
		this.master = master;
		shadowsMap = new HashMap<>();
	}

	public void addShadow(Server shadow) {
		log.debug("");
		shadowsMap.put(shadow, new DFSModelDAOImpl(new DFSDataSource(shadow.getIp())));
	}

	public void removeShadow(Server shadowToRemove) {
		log.debug("");
		DFSModelDAO removedDAO = (DFSModelDAO) shadowsMap.remove(shadowToRemove);

	}
	
	@Override
	public void deleteFile(final File file) {
		int numberOfAffectedRows = masterDAO.deleteFile(file);
	}
	
	@Override
	public Server getMasterServer() {
		// fetch master
		List<Server> list = masterDAO.fetchServersByRole(ServerRole.MASTER);

		if (list.size() > 1) {
			// raise fatal error AND WRITE LOG MESSAGE
			log.error("More than one master found in DB, core panic");
			System.exit(-1);
			
		} else if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	public void saveServer(Server server) {
		log.debug("Saving server:" + server.toString());
		masterDAO.saveServer(server);
	}

	@Override
	public File getFileByFileName(String fileName) {
		log.debug("Fetching file: fileName=" + fileName);
		return masterDAO.fetchFileByFileName(fileName);
	}

	@Override
	public Server getSlaveByFile(File file) {
		log.debug("Fetching servers with file: " + file.getName());

		List<Server> servers = masterDAO.fetchServersByFileId(file.getId());

		// TODO :choose server !
		if (servers == null || servers.isEmpty()) {
			// raise fatal error
		}

		return servers.get(0);
	}

	@Override
	public List<Server> getSlaves() {
		log.debug("");
		return masterDAO.fetchServersByRole(ServerRole.SLAVE);
	}

	@Override
	public File getFileById(Integer fileId) {
		log.debug("");
		return masterDAO.fetchFileById(fileId);
	}

	@Override
	public void saveFileOnServer(FileOnServer fileOnServer) {
		log.debug("");
		masterDAO.saveFileOnServer(fileOnServer);
		
	}

	@Override
	public List<File> getFilesOnSlave(Server slave) {
		log.debug("");
		return masterDAO.fetchFilesOnServer(slave);
	}

	@Override
	public Integer saveFile(final File file) {
		log.debug("");
		return masterDAO.saveFile(file);
	}
	
	@Override
	public void updateFile(final File file) {
		log.debug("");
		int numberOfAffectedRows = masterDAO.updateFile(file);
	}

	@Override
	public void deleteFileOnServer(FileOnServer fileOnServer) {
		log.debug("");
		int numberOfAffectedRows = masterDAO.deleteFileOnServer(fileOnServer);
		
	}

	@Override
	public List<Server> getSlavesByFile(File file) {
		log.debug("");
		return masterDAO.fetchServersByFileId(file.getId());

	}

	@Override
	public void cleanDB() {
		modelDAO.cleanDB();
	}
	@Override
	public List<File> getAllFiles() {
		return modelDAO.fetchAllFiles();
	}
}
