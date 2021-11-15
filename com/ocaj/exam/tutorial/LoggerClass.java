package com.ocaj.exam.tutorial;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.logging.*;

public class LoggerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		/*Ensure directory has been created*/
		Files.createDirectories(Paths.get("logs"));
		/*Get the date to be used in the filename*/
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMddhhmmss");
		LocalDateTime now = LocalDateTime.now();
		String date = now.format(df);
		//Set up the filename in the logs directory
		String logFileName = "logs\\testlog-" + date + ".txt";
		/*Set up Logger*/
		FileHandler myFileHandler = new FileHandler(logFileName);
		myFileHandler.setFormatter(new SimpleFormatter());
		Logger ocajLogger = Logger.getLogger("OCAJ Logger");
		ocajLogger.setLevel(Level.ALL);
		ocajLogger.addHandler(myFileHandler);
		//Log message
		ocajLogger.info("\nThis is a logged information message.");
		//Close file
		myFileHandler.close();
	}

}
