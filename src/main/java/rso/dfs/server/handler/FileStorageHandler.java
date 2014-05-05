package rso.dfs.server.handler;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author Adam Papros<adam.papros@gmail.com>
 * 
 * */
public class FileStorageHandler implements StorageHandler {

	private static final String prefix = "tmp";

	@Override
	public byte[] readFile(long fileId) {
		Path path = Paths.get(assemblyPath(fileId));
		byte[] bytes;
		try {
			bytes = Files.readAllBytes(path);
		} catch (IOException e) {
			throw new RuntimeException("Unable to read file. " + e);
		}

		return bytes;
	}

	@Override
	public void writeFile(long fileId, byte[] fileBody) {
		Path path = Paths.get(assemblyPath(fileId));
		try {
			Files.write(path, fileBody);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String assemblyPath(long fileId) {
		File file = new File(prefix + FileSystems.getDefault().getSeparator() + fileId);
		return file.getAbsolutePath();
	}

}
