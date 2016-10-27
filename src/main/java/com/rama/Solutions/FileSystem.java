package com.rama.Solutions;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileSystem {

	public static void main(String[] args) {
	/*java.nio.file.FileSystem fsystem=FileSystems.getDefault();

	Path sourcePath=fsystem.getPath("rama.log");
	Path despath=fsystem.getPath("rama1.log");
	System.out.println(sourcePath.toAbsolutePath()+" "+despath.toAbsolutePath());
	try {
		Files.move(sourcePath, despath);
	} catch (Exception e) {
		// TODO: handle exception
	}
	*/
		
		FileVisitor<Path> myFileVisitor = new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
			throws IOException {
			System.out.println("Visited File: "+file.toString());
			return FileVisitResult.CONTINUE;
			}
			};
			java.nio.file.FileSystem fileSystem = FileSystems.getDefault();
			Path directory= fileSystem.getPath(".");
			try {
			Files.walkFileTree(directory, myFileVisitor);
			} catch (IOException e) {
			e.printStackTrace();
			}
		
	}
}
