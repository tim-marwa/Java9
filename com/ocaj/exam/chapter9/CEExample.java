package com.ocaj.exam.chapter9;

import java.io.IOException;


public class CEExample implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		Thread thrd = new Thread();
		thrd.start();
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException ie){
			ie.printStackTrace();
		}
		//Simulate an exception
		throw new IOException("Oops");
	}

	@Override
	public void run() {
		while(true){
			try{
				Thread.sleep(5000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
			System.out.println("Alive!");
		}
		
	}

}
