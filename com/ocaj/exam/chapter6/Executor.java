package com.ocaj.exam.chapter6;

import java.util.ArrayList;

public class Executor {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arrayOfInts = new int[3];
		arrayOfInts[0] = 5;
		arrayOfInts[1] = 10;
		arrayOfInts[2] = 15;
		
		System.out.println("First: "  + arrayOfInts[0] + 
				           " Second: " + arrayOfInts[1] + 
				           " Third: " +  arrayOfInts[2]);
		String[] clockTypes1;
		int[] alarms1;
		String clockTypes2[];
		int alarms2[];
		String[] clockTypes3 = new String[3];
		String clockTypes[] = new String[3];
		int alarms3[] = new int[3];
 		int[] alarms4 = {730, 900};
 		String[] clockTypes4 = {"Wrist Watch", "Desk Clock", "Wall Clock"};
 		Integer[] integers = {new Integer(1000), new Integer(2250)};
 		System.out.println(clockTypes4[1]);
 		if(clockTypes4[0].equalsIgnoreCase("Grand Father Clock")){
 			System.out.println("It's a grandfather clock!");
 		}
 		System.out.println("clockTypes4.length: " + clockTypes4.length);
 		String[] newClockTypes = new String[2];
 		System.arraycopy(clockTypes4, 1, newClockTypes, 0, 2);
 		for(String s: clockTypes4){
 			System.out.println("clockTypes4" + s);
 		}
 		System.out.println("--------");
 		for(String s: newClockTypes){
 			System.out.println(s);
 		}
 		char[][] ticTacToeBoard = new char[3][3];
 		
 		for(int y=0;y<3;y++){
 			for(int x=0;x<3;x++){
 				ticTacToeBoard[x][y] = '-';
 			}
 		}
 		ticTacToeBoard[0][0] = 'X';
 		ticTacToeBoard[1][1] = '0';
 		ticTacToeBoard[0][2] = 'X';
 		for(int y=0; y<3; y++){
 			for(int x=0; x<3; x++){
 				System.out.print(ticTacToeBoard[x][y] + " ");
 			}
 			System.out.print("\n");
 		}
 		//String[][] chessBoard;
 		String chessBoard[][];
 		//int [][][] cube;
 		//int cube[][][];
 		
 		String [][] square = {{"1","2"},{"3","4"}};
 		//String [][] square = new String[2][2];
 		int [][][] cube = new int[3][3][2];
 		int [][] oddSizeArray={{1,2}, {1,2,3,4}, {1,2,3}};
 		
 		int [][][] array3D = new int[2][][];
 		array3D[0] = new int[5][];
 		array3D[1] = new int[3][];
 		array3D[0][0] = new int[7];
 		array3D[0][1] = new int[2];
 		array3D[1][0] = new int[4];
	
 		int[][] grid = {{1,2},{3,4}};
 		System.out.println(grid[0][0] + " " + grid[1][0]);
 		System.out.println(grid[0][1] + " " + grid[1][1]);
	
 		int[] subGrid = grid[1];
 		
 		Integer integer1 = new Integer(1300);
 		Integer integer2 = new Integer(2000);
 		ArrayList<Integer> basicArrayList = new ArrayList<Integer>();
 		basicArrayList.add(integer1);
 		basicArrayList.add(integer2);
 		
 		System.out.println(basicArrayList.get(0) + " - " + basicArrayList.get(1));
	
 		System.out.println("Size: " + basicArrayList.size());
 	
 		basicArrayList.add(2, new Integer(5));
 		
 		System.out.println("Size: " + basicArrayList.size()); 	
 		
 		basicArrayList.remove(1);
 		
 		System.out.println("Size: " + basicArrayList.size()); 	
 
 		double temperaturesArray[] = {1,3,5,7,6,4,2};
 		
 		ArrayList<Double> temperaturesArrayList = new ArrayList(7);
 		temperaturesArrayList.add(1.0);
 		temperaturesArrayList.add(3.0);
 		temperaturesArrayList.add(5.0);
 		temperaturesArrayList.add(7.0);
 		temperaturesArrayList.add(6.0);
 		temperaturesArrayList.add(4.0);
 		temperaturesArrayList.add(2.0);
 		
 		double average = 0;
 		
 		for(double val:temperaturesArray)
 			average += val;
 		
 		average /= temperaturesArray.length;
 		
 		System.out.println("Average Standard Array:" + average);
 		
 		average = 0;
 		for(Double val : temperaturesArrayList)
 			average += val;
 		average /= temperaturesArrayList.size();
 		
 		System.out.println("Average ArrayList:" + average);
 		
 		double higher = temperaturesArray[0];
 		for(int i = 1 ; i < temperaturesArray.length; i++)
 			higher = higher >= temperaturesArray[i]?higher:temperaturesArray[i];
 		
 		System.out.println("Maximum Standard Array:" + higher);
 		
	}

}
