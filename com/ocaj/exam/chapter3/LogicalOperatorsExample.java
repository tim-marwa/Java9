package com.ocaj.exam.chapter3;

public class LogicalOperatorsExample {
	public static void main(String[] args) {
		boolean and1 = true && true;
		boolean and2 = true && false;
		boolean and3 = false && true;
		boolean and4 = false && false;
		
		boolean or1 = true || true;
		boolean or2 = true || false;
		boolean or3 = false || true;
		boolean or4 = false || false;
		
		System.out.println("ands");
		System.out.println(and1);
		System.out.println(and2);
		System.out.println(and3);
		System.out.println(and4);
		
		System.out.println("ors");
		System.out.println(or1);
		System.out.println(or2);
		System.out.println(or3);
		System.out.println(or4);
		
		System.out.println("nots");
		System.out.println(!false);
		System.out.println(!true);
		System.out.println(!!true);
		System.out.println(!!!true);
		System.out.println(!!!!true);
		
		System.out.println("Not Usage");
		
		int iVar1 = 0;
		int iVar2 = 1;
		
		if(!(iVar1 <= iVar2)){
			System.out.println("ENTROU IVAR0");
		}
		
		boolean bVar1 = false, bVar2 = true;
		
		if((bVar1 && bVar2) || (!(bVar1 && bVar2))){
			System.out.println("ENTROU BVAR0");
		}
		
		if(!"NAME".equals("NAME")){
			System.out.println("ENTROU EQUALS");
		}
		
		String s = "Captain Jack";
		if(!s.startsWith("Captain")){
			System.out.println("ENTROU StartsWith");
		}
		
	}

}
