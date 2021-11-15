package com.ocaj.exam.chapter2;
public class ActivitiesDayContinue {
	public static void main(String[] args) {
		int totalDaysCamping = 0;
		int daysAllowedFishing = 5;
		for(int i = 1; i< 8; ++i) {
			System.out.println("\nDay " + i + " Camping");
			totalDaysCamping++;
			if (totalDaysCamping > daysAllowedFishing)
				continue;
			System.out.println("and Fishing");
		}
	}
}
