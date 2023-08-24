package Set1;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter 2 numbers to compare the maximum ");
		double a=input.nextDouble();
		double b= input.nextDouble();
		
		System.out.print("Maximum number: "+ max(a,b));
		
		

	}
	
	public static double max(double a, double b) {
		return ((a+b)+Math.abs(a-b))/2;
	}

}
