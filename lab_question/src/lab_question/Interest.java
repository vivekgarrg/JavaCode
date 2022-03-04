package lab_question;

import java.util.Scanner;

interface Interest1{
	public void simpleInterest();
	public void compInterest();
	public static final double rate = 25;
}

public class Interest implements Interest1{
	public double p,r,t;
	
	public Interest(double p, double r, double t){
		this.p = p;
		this.r = r;
		this.t = t;
	}
	
	public void simpleInterest(){
		double si = (p*r*t)/100;
		System.out.println("\nSimple Interest : Rs." + si);
	}
	
	public void compInterest(){
		double ci = p * Math.pow(1.0 + r/100.0 , t) - 1;
		System.out.println("\nCompound Interest : Rs." + ci);
	}
	
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter Principle Amount : Rs.");
		double p = sc.nextDouble();
		System.out.print("\nEnter Time(in years) :");
		double t = sc.nextDouble();
		
		Interest i = new Interest(p,rate,t);
		
		i.simpleInterest();
		i.compInterest();
	}
}