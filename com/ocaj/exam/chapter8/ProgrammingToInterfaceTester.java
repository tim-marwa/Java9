package com.ocaj.exam.chapter8;

public class ProgrammingToInterfaceTester {

	public ProgrammingToInterfaceTester() throws Exception {
		super();
		Logger logger = new Logger();
		SystemStatus  systemStatus= new SystemStatus();
		NetworkConnection networkConnection = new NetworkConnection();
		logger.appendToLog(systemStatus);
		logger.appendToLog(networkConnection);
		networkConnection.connect();
		Thread.sleep(2000);
		logger.appendToLog(systemStatus);
		logger.appendToLog(networkConnection);
		logger.close();
	}
	
	public static void main(String[] args) throws Exception {
		new ProgrammingToInterfaceTester();
	}
	
}
