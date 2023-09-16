package Set1;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Divisor and dividing-number: ");
		int divisor=input.nextInt();
		int number=input.nextInt();
		
		System.out.print("Quotient is: "+div(number,divisor));

	}
	
	public static int div(int number,int divisor) {
		int quotient=0;
		while(number>divisor-1) {
			quotient++;
			number-=divisor;
		}
		return quotient;
	}

}
