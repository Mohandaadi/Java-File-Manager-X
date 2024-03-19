package javaFileSystemManager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileManager fileManager = new FileManager();
		
		Directory documents = new Directory("Documents");
		Directory documents1 = new Directory("Desktop");
		Directory documents2 = new Directory("Images");
		File resume = new File("resume.txt", "Content of resume");
		File resume1 = new File("Main.java", "Content of resume");
		File resume2 = new File("image.jpg", "Content of resume");
		documents.addFile(resume);
		documents.addFile(resume1);
		documents.addFile(resume2);
        fileManager.getRoot().addSubdirectory(documents);
        fileManager.getRoot().addSubdirectory(documents1);
        fileManager.getRoot().addSubdirectory(documents2);
        
        fileManager.listFiles(documents);
        fileManager.listDirectories(fileManager.getRoot());
	}

}
