package com.ocaj.exam.tutorial;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
public class PrintFileNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Print out .txt file names in a given folder
		try {
			Files.walk(Paths.get("C:\\Intel\\Logs")).forEach(p -> {
				if (p.getFileName().toString().endsWith(".log")) {
					System.out.println("Text Document:" + p.getFileName());
				}
		});
		} catch (IOException e) {
		e.printStackTrace();	
		}
	}

}
