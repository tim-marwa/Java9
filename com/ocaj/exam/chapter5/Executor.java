package com.ocaj.exam.chapter5;

public class Executor {

public static final double PI = 3.14;
	
	private static void addTwo(int value){
		System.out.println("Parameter value =" + value);
		value += 2;
		System.out.println("Leaving method: value =" + value);
	}
	private static void addThree(Number value){
		System.out.println("Parameter value =" + value.getNumber());
		value.setNumber(value.getNumber() + 3);
		System.out.println("Leaving method: value =" + value.getNumber());		
	}
	private static void sampleMethod(){ //Start BLOCK A
		int totalCount = 0;
		for(int i=0; i<3; i++){ //START BLOCK B
			int forCount = 0;
			totalCount ++;
			forCount++;
			{//Start of code block C
				int block1Count = 0;
				totalCount++;
				forCount++;
				block1Count++;
			} // END OF BLOCK C
			{ // START BLOCK D
				int block2Count = 0;
				totalCount++;
				forCount++;
				block2Count++;
			} //END BLOCK D
			int block1Count;
			int block2Count;
		} // END OF BLOCK B
	} //END OF BLOCK A
	
	private static float findMilesPerHour(float milesTraveled, float hoursTraveled){
		return milesTraveled / hoursTraveled;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MathTools mTools = new MathTools();
		int x = 8;
		int y=13;
		int lowestInt = mTools.findLowerValue(x,y);
		System.out.println("lowestInt:" + lowestInt);
	
		LogManager logManager = new LogManager();
		logManager.logInfo("First log message", -299);
		logManager.logInfo("Second log message");
		int value = 1;
		System.out.println("Argument: value = " + value);
		addTwo(value);
		System.out.println("After method call: value =" + value);
		Number value2 = new Number(1);
		System.out.println("Argument REF: value = " + value2.getNumber());
		addThree(value2);
		System.out.println("After method call REF: value =" + value2.getNumber());
		sampleMethod();
		System.out.println(findMilesPerHour(2f,1f));
		Television tv1 = new Television();
		Television tv2 = new Television();
		tv1.setChannel(2);
		tv2.setChannel(7);
		System.out.println("Television channel for tv1: " + tv1.getChannel());
		System.out.println("Television channel for tv2: " + tv2.getChannel());
		Integer intObj = Integer.valueOf(7);
		System.out.println("intObj:" + intObj);
		LoanDetails ld = new LoanDetails();
		ld.setPrincipal(150_000);
		System.out.println("Payment: " + ld.monthlyPayment());
	
		LoanDetails secondLD = new LoanDetails(10, 0.025, 125_000);
		System.out.println("Payment 2: " + secondLD.monthlyPayment());
		
		ChildClass childClass = new ChildClass();
		ParentClass parentClass = new ParentClass();
		ParentClass parentClass2 = new ChildClass();
		childClass = new ChildClass("String_C");
		parentClass = new ParentClass("String_P");
		parentClass2 = new ChildClass("String_P2");
		System.out.println("childClass.className():" +childClass.className() );
		ShippingPackage packageOne = new ShippingPackage();
		ShippingPackage packageTwo = new ShippingPackage();
		ShippingPackage packageThree = new ShippingPackage();
		
		System.out.println("Package One Tracking Number: " + packageOne.getPackageTrackingNumber());
		System.out.println("Package One Tracking Number: " + packageTwo.getPackageTrackingNumber());
		System.out.println("Package One Tracking Number: " + packageThree.getPackageTrackingNumber());
	
		System.out.println("Next Tracking Number: " + ShippingPackage.nextTrackingNumber);
	
	
	}

}
