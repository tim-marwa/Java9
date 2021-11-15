package com.ocaj.exam.chapter2;
public class FishingPerHourBreak {
	public static void main(String[] args) {
		int totalHoursFishing = 0;
		int hoursAllowedFishing = 4;
		for(int i = 1; i< 25; ++i) {
			totalHoursFishing = ++totalHoursFishing;
			if (totalHoursFishing > hoursAllowedFishing)
				break;
			System.out.println("Fishing for " + i + " hours");
		}
	}
}
