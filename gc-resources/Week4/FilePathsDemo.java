package Week4;

import java.io.*;
import java.nio.file.*;//Path;
//import java.nio.file.Paths;

public class FilePathsDemo {

	public static void main(String[] args) throws IOException {

//relative path
		Path path1 = Paths.get("relative-file.txt");	//INTERFACE USING FACTORY METHOD; STORES IN PACKAGE
		if(Files.notExists(path1)) {		//OPTION TO ADD MULTIPLE ARGUMENTS SUCH AS WITH STRING.FORMAT() AND PRINTF()
		Files.createFile(path1);
		}
		Path path2 = Paths.get("src/rel-file2.txt");	//STORES IN SRC
		if(Files.notExists(path2)) {
			Files.createFile(path2);
		}
//absolute path
		Path path3 = Paths.get("C:/Users/Jillian/Desktop/readMe.txt");	//STORES IN DESKTOP
		if(Files.notExists(path3)) {
			Files.createFile(path3);
		}
		Path path4 = Paths.get(System.getProperty("user.home") + "/Desktop/readMe.txt");
		System.out.println(path4);
	}

}
