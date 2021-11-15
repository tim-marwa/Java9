package com.ocaj.exam.chapter7;

import java.io.File;

public class PrinterFaxCombo implements Fax, Printer {
	private Object incomingFax;
	private int inkLevel;
	
	private void faxFile(File f){}
	
	private void sendFileToPrinter(){}
	
	private boolean dialNumber(int Number){
		return true;
	}
	
	@Override
	public void printFile(File f) {
		sendFileToPrinter();
	}

	@Override
	public int getInkLevel() {
		return inkLevel;
	}

	@Override
	public void sendFax(File f, int number) {
		dialNumber(number);
		faxFile(f);
	}

	@Override
	public Object getReceivedFaxes() {
		return incomingFax;
	}

}
