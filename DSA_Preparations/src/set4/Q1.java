package set4;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter x: ");
		double x=input.nextDouble();
		
		double x_radian=x*3.142/180;
		
		double sinx_originalvalue=Math.sin(x_radian);
		
		
		double sinx_calculatedvalue=0;
		int even_odd=1;
		
		while(Math.pow(10, -6)<=Math.abs(sinx_originalvalue-sinx_calculatedvalue)) {
			
			if(even_odd%4==1) {
				sinx_calculatedvalue+=Math.pow(x_radian, even_odd)/factorial(even_odd);
			}else {
				sinx_calculatedvalue-=Math.pow(x_radian, even_odd)/factorial(even_odd);
			}
			even_odd+=2;
		}
		
		System.out.print(sinx_calculatedvalue);
		
	}

	public static double factorial(int even_odd) {
		// TODO Auto-generated method stub
		
		int fact=1;
		for(int i=2;i<=even_odd;i++) {
			fact*=i;
		}
		return fact;
	}

}
