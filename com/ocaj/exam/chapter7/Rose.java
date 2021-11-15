package com.ocaj.exam.chapter7;

public class Rose extends Plant{

	private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 2;

	private void grow() {
		int currentHeight = getHeight();
		setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
	}

	@Override
	public void doSpring() {
		grow();
		addYearToAge();
		System.out
				.println("Spring: The Rose is starting to grow leaves and new branches.");
		System.out.println("\tCurrent Age:" + getAge() + " Current Heigh:"
				+ getHeight());
	}

	@Override
	public void doSummer() {
		System.out.println("Summer: The Rose has stopped growing.");
		System.out.println("\tCurrent Age:" + getAge() + " Current Heigh:"
				+ getHeight());
	}

	@Override
	public void doFall() {
		System.out.println("Fall: The Rose begins to wilt.");
		System.out.println("\tCurrent Age:" + getAge() + " Current Heigh:"
				+ getHeight());
	}

	@Override
	public void doWinter() {
		System.out.println("Winter: The maple tree is dormant underground.");
		System.out.println("\tCurrent Age:" + getAge() + " Current Heigh:"
				+ getHeight());
	}

}
