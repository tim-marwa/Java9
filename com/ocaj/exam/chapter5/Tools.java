package com.ocaj.exam.chapter5;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tools {
	public static String formatDate(){
		Date date = new Date();
		Format formatter = new SimpleDateFormat("MMM-dd-yy");
		return formatter.format(date);
	}
}
