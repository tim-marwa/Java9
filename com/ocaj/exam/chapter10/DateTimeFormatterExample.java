package com.ocaj.exam.chapter10;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatterExample {

	public static void main(String[] args) {
		LocalDateTime currentDate = LocalDateTime.now();		
		System.out.println("Current Date:: " + currentDate);
		System.out.println("Current Date in \"ISO_DATE_TIME\" format:: " + DateTimeFormatter.ISO_DATE_TIME.format(currentDate));
		System.out.println("Current Date in \"YYYYMMDD\" format:: " + DateTimeFormatter.ofPattern("yyyyMMdd").format(currentDate));
		System.out.println("Current Date in \"dd-MM-yyyy HH:mm:ss\" format:: " + DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(currentDate));
		System.out.println("Current Date in \"YYYY_MM_DD\" format:: " + DateTimeFormatter.ofPattern("yyyy_MM_dd").format(currentDate));
	}

}
