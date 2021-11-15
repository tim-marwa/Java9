package com.ocaj.exam.chapter5;

public class LoanDetails {
	private int term;
	private double rate;
	private double principal;
	
	public LoanDetails() {
		this(180,0.025,0);
		System.out.println("Payment " + this.monthlyPayment());
	}

	public LoanDetails(int t, double r, double p){
		term = t;
		rate = r;
		principal = p;
	}
	
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	
	public double monthlyPayment(){
		return (rate*principal /12)/(1.0 - Math.pow((rate/12 + 1), (-term)));
	}

}
