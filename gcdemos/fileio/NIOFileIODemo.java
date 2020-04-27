package gcdemos.fileio;

import java.io.*;
import java.nio.file.*;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.nio.file.StandardOpenOption;
import java.util.*;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;

public class NIOFileIODemo {
	
	// Note: NIO uses the Path class, not just a file path String.
	private static Path filePath = Paths.get("hellohello.txt"); // TODO set path
	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);  
		System.out.println("Available commands:");
		System.out.println(" list");
		System.out.println(" add <line to add here>");
		System.out.println(" quit");
		
		while (true) {
			System.out.print("Enter a command: ");
			String command = scnr.nextLine();
			if (command.equals("quit")) {
				break;
			} else if (command.equals("list")) {
				List<String> things = readFile();
				System.out.println(things);
			} else if (command.startsWith("add ")) {
				String thing = command.substring(4);
				appendLineToFile(thing);
			} else {
				System.out.println("Invalid command.");
			}
		}
		System.out.println("Goodbye.");
		scnr.close();
	}
	
	/**
	 * Read all the lines from a file and store them in a List of Strings.
	 */
	public static List<String> readFile() {
		// TODO
		try {
		return Files.readAllLines(filePath);
		}catch(IOException io) {
			System.out.println("Unable to read file.");
		}
		return new ArrayList<>();
	}
	
	/**
	 * Add a line to the end of the file.
	 */
	public static void appendLineToFile(String line) {
		// Files.write requires a list of lines. Create a list of one line.
		List<String> lines = Collections.singletonList(line);
		// TODO
		try {
			Files.write(filePath, lines, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
		}catch(IOException io) {
			System.out.println("Unable to write to file.");
		}
	}

}
