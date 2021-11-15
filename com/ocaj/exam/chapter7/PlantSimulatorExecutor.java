package com.ocaj.exam.chapter7;

public class PlantSimulatorExecutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Creating a mapple tree and tulip...");
		MapleTree mapleTree = new MapleTree();
		Tulip tulip = new Tulip();
		Rose rose = new Rose();
		System.out.println("Entering a loop to simulate 3 years");
		for(int i=0; i<3; i++){
			mapleTree.doSpring();
			tulip.doSpring();
			rose.doSpring();
			mapleTree.doSummer();
			tulip.doSummer();
			rose.doSummer();
			mapleTree.doFall();
			tulip.doFall();
			rose.doFall();
			mapleTree.doWinter();
			tulip.doWinter();
			rose.doWinter();
		}
	}

}
