package com.ocaj.exam.chapter3;
public class StringExamples {
	public static void main(String[] args) {
		float reale = .007812f;
		float escudo = .0125f;	
		String quote = "Dead Men Tell No Tales";
		String rquote = quote.replace("No Tales", "Tales");			
		System.out.println("Replaced Quote:" + rquote);	
		System.out.println("Quote:" + quote);	
		System.out.println(reale  + escudo + "% of one gold doubloon");
		System.out.println((reale  + escudo) + "% of one gold doubloon");
		System.out.println("% of one gold doubloon " + (reale +escudo));
		System.out.println("% of one gold doubloon " + reale +escudo);	
		String item = "doubloon";
		String question = "What is a " + item + "? ";
		System.out.println("Question: " + question);	
		String title1 = " shovels.";
		String title2 = "Shovels: ";	
		int flatShovels = 5;
		int roundPointShovels = 6;	
		System.out.println(flatShovels + roundPointShovels + title1);	
		System.out.println((flatShovels + roundPointShovels) + title1);	
		System.out.println(title2 + flatShovels + roundPointShovels);	
		System.out.println(title2 + (flatShovels + roundPointShovels));	
		String pirateMessage = "  Buried Treasure Chest! ";
		char c1 = pirateMessage.charAt(0);
		char c2 = pirateMessage.charAt(2);
		char c3 = pirateMessage.charAt(23);
		char c4 = pirateMessage.charAt(24);
		char c5 =' ';
		try {
			c5 = pirateMessage.charAt(45);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("C5 index error:" +e.getMessage());
		}
		System.out.println("charAt" + c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);
		int i1 = pirateMessage.indexOf('u');
		int i2 = pirateMessage.indexOf('u',9);
		int i3 = pirateMessage.indexOf("sure");
		int i4 = pirateMessage.indexOf("Treasure",10);
		int i5 = pirateMessage.indexOf("u",100);
		System.out.println("indexOf" + i1 + " " + i2 + " " + i3 + " " + i4 + " " + i5);
		int i = pirateMessage.length();
		String string = "box";
		int value1 = string.length();
		String[] stringArray = new String[3];
		int value2 = stringArray.length;
		System.out.println("length" + i + " " + value1 + " " + value2);
		String c = pirateMessage.concat("Weigh anchor!");
		System.out.println("concat C: " + c);
		String s1 = pirateMessage.replace('B', 'J');
		String s2 = pirateMessage.replace('\u0020', 'X');
		String s3 = pirateMessage.replace("Chest", "Coins");
		System.out.println("S1:" + s1);
		System.out.println("S2:" + s2);
		System.out.println("S3:" + s3);	
		boolean b1 = pirateMessage.startsWith("  Buried Treasure");
		boolean b3 = pirateMessage.startsWith("Treasure", 8);
		boolean b4 = pirateMessage.startsWith("Treasure", 9);
		System.out.println("b1:" + b1);
		System.out.println("b3:" + b3);
		System.out.println("b4:" + b4);
		boolean e1 = pirateMessage.endsWith("Treasure Chest!  ");
		boolean e2 = pirateMessage.endsWith("Treasure Chest! ");
		System.out.println("e1:" + e1);
		System.out.println("e2:" + e2);
		String ss1 = pirateMessage.substring(9);
		String ss2 = pirateMessage.substring(9,10);
		String ss3 = pirateMessage.substring(9,23);
		try{
			String ss4 = pirateMessage.substring(9,8);
			System.out.println("SS4:"  + ss4 );
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("SS4 EXCEPTION:" + e.getMessage());
		}
		System.out.println("SS1:"  + ss1 );
		System.out.println("SS2:"  + ss2 );
		System.out.println("SS3:"  + ss3 );
		System.out.println("Empty String equal Test" + (" ".equals("\u0020")));
		String t = pirateMessage.trim();	
		System.out.println("trim T: " + t);
		String t1 = "\t   One day i Will Be Like You\t   ";
		System.out.println("|" + t1 + "|");
		String l1 = pirateMessage.toLowerCase();
		System.out.println("L1: " + l1);
		String u1 = pirateMessage.toUpperCase();
		System.out.println("U1: " + u1);
		Boolean bb1 = pirateMessage.equalsIgnoreCase("  Buried TREASURE Chest! ");
		Boolean bb2 = pirateMessage.equalsIgnoreCase(" Buried XXXXXXXX Chest! ");
		System.out.println("BB1:" + bb1);
		System.out.println("BB2:" + bb2);
		String msg = "   Maroon the First Mate with a flagon of water and a pistol!   ";
		msg = msg.trim().replace("First Mate", "Quartermaster").substring(0 ,47) + ".";
		System.out.println("MSG:" + msg);

		StringBuilder mateyMessage = new StringBuilder("Shiver Me Timbers!");
		System.out.println("append: " +mateyMessage.append(" Bad Storm!"));
		StringBuilder e = new StringBuilder("append Examples:");
		e.append(" ").append("1");
		e.append(" ").append(new StringBuffer("2"));
		e.append(" ").append('\u0031');
		e.append(" ").append((int) 2);
		e.append(" ").append(1L);
		e.append(" ").append(2F);
		e.append(" ").append(1D);
		e.append(" ").append(true);
		System.out.println( e);
		mateyMessage = new StringBuilder("Shiver Me Tim");
		System.out.println("insert: " + mateyMessage.insert(13, " and Bricks!"));
		mateyMessage = new StringBuilder("Shiver Me Tim");
		System.out.println("delete: " + mateyMessage.delete(6, 16));
		mateyMessage = new StringBuilder("Shiver Me Tim");
		System.out.println("deleteCharAt: " + mateyMessage.deleteCharAt(12));
		StringBuilder r = new StringBuilder("part");
		r.reverse();
		System.out.println("reverse.: " + r + "!" );
		StringBuilder sb0 = new StringBuilder();
		StringBuilder sb1 = new StringBuilder("New String Builder1");
		CharSequence cs2 = new String("Hello");
		StringBuilder sb2 = new StringBuilder(cs2);
		StringBuilder sb3 = new StringBuilder("Hello World!");
		String msg011 = "WALK THE PLANK!";
		String msg2 = "WALK THE PLANK!";
		String msg3 = ("WALK THE PLANK!");
		String msg4 = new String("WALK THE PLANK!");
		System.out.println("MSG1 eq MSG2:" + msg011.equals(msg2));
		System.out.println("MSG1 eq MSG3:" + msg011.equals(msg3));
		System.out.println("MSG1 eq MSG4:" + msg011.equals(msg4));	
		String cmd = "Set Sail!";
		String command = cmd;
		System.out.println("cmd == command:" + (cmd == command));
		String interjection1 = "Arrrgh!";
		String interjection2 = "Arrrgh!";
		System.out.println("equals:" + interjection1.equals(interjection2));
		System.out.println("RES:" + (interjection1 == null?interjection2==null:interjection1.equals(interjection2)));
		String eggs1 = "Cackle fruit";
		String eggs2 = "Cackle fruit";
		String eggs3 = "Caakle fruit";
		String eggs4 = "Cockle fruit";
		System.out.println("eggs1 compareTo eggs2:" + eggs1.compareTo(eggs2));
		System.out.println("eggs1 compareTo eggs3:" + eggs1.compareTo(eggs3));
		System.out.println("eggs1 compareTo eggs4:" + eggs1.compareTo(eggs4));

		
	}

}
