package RecursionsPractice;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n");
		int n=input.nextInt();
		
		System.out.println(fib(n));

	}
	
	public static int fib(int n) {
		
		if(n==0||n==1)
			return n;
		
		return fib(n-1)+fib(n-2);
	}


}
