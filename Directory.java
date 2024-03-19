package javaFileSystemManager;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	
	private String name;
	private List<File> files;
	private List<Directory> subdirectories;
	
	public Directory(String name) {
		this.name = name;
		this.files = new ArrayList<>();
		this.subdirectories = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public List<File> getFiles(){
		return files;
	}
	
	public List<Directory> getSubdirectories(){
		return subdirectories;
	}
	
	public void addFile(File file) {
		files.add(file);
	}
	
	public void removeFile(File file) {
		files.remove(file);
	}
	
	public void addSubdirectory(Directory directory) {
		subdirectories.add(directory);
	}
	
	public void removeSubdirectory(Directory directory) {
		subdirectories.remove(directory);
	}
	
	@Override
	public String toString() {
		return "Directory: " + name;
	}
}
