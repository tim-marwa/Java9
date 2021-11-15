package com.ocaj.exam.chapter2;

public class DoWhileFishingSessionBait {
	private static FishingSession fishingSession = new FishingSession();

	private static void castForFish() {
		fishingSession.setBaitAvailable(false);
	}

	public static void main(String[] args) {
		int piecesOfBait = 5;
		piecesOfBait = 0; //Fox steals the bait!
		
		do {
			castForFish();
			if(fishingSession.isBaitAvailable() == false){
				fishingSession.setBaitAvailable(true);
				piecesOfBait--;
			}
		}
		while(piecesOfBait != 0);
	}
}
