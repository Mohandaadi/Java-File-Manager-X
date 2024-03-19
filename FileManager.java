package javaFileSystemManager;

public class FileManager {
	
	private Directory root;
	
	public FileManager() {
        root = new Directory("root");
    }
	
	public Directory getRoot() {
		return root;
	}
	
	public void listFiles(Directory directory) {
		System.out.println("Files in " + directory.getName() + ":");
		for(File file : directory.getFiles()) {
			System.out.println(file);
		}
	}
	
	public void listDirectories(Directory directory) {
		System.out.println("Subdirectories of " + directory.getName() + ":");
		for(Directory subdirectory : directory.getSubdirectories()) {
			System.out.println(subdirectory);
		}
	}
}
