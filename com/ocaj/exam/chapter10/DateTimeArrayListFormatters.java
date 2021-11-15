package com.ocaj.exam.chapter10;
import java.time.LocalDateTime; // import the LocalDateTime class
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class DateTimeArrayListFormatters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    LocalDateTime ldt = LocalDateTime.now();
		    System.out.println(ldt);
	 		
	 		ArrayList<DateTimeFormatter> ldtArrayList = new ArrayList<>();
	 		ldtArrayList.add(DateTimeFormatter.BASIC_ISO_DATE);
	 		ldtArrayList.add(DateTimeFormatter.ISO_LOCAL_TIME);
	 		ldtArrayList.add(DateTimeFormatter.ISO_LOCAL_DATE);
	 		ldtArrayList.add(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	 		ldtArrayList.add(DateTimeFormatter.ISO_TIME);
	 		ldtArrayList.add(DateTimeFormatter.ISO_DATE);
	 		ldtArrayList.add(DateTimeFormatter.ISO_DATE_TIME);
	 		ldtArrayList.forEach(c -> {
	 			System.out.println(ldt.format(c));
	 		});

	}

}
