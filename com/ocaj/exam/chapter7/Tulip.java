package com.ocaj.exam.chapter7;

public class Tulip extends Plant {
	private static final int AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON = 1;

	private void grow() {
		int currentHeight = getHeight();
		setHeight(currentHeight + AMOUNT_TO_GROW_IN_ONE_GROWING_SEASON);
	}

	private void dieDownForWinter() {
		setHeight(0);
	}

	@Override
	public void doSpring() {
		grow();
		addYearToAge();
		System.out
				.println("Spring: The tulip is starting to grow leaves and new branches.");
		System.out.println("\tCurrent Age:" + getAge() + " Current Heigh:"
				+ getHeight());
	}

	@Override
	public void doSummer() {
		System.out.println("Summer: The tulip has stopped growing.");
		System.out.println("\tCurrent Age:" + getAge() + " Current Heigh:"
				+ getHeight());
	}

	@Override
	public void doFall() {
		System.out.println("Fall: The Rose has stopped growing and is losing its leaves..");
		System.out.println("\tCurrent Age:" + getAge() + " Current Heigh:"
				+ getHeight());
	}

	@Override
	public void doWinter() {
		dieDownForWinter();
		System.out.println("Winter: The Rose is dormant.");
		System.out.println("\tCurrent Age:" + getAge() + " Current Heigh:"
				+ getHeight());
	}
}
