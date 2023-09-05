package RecursionsPractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n");
		int n=input.nextInt();
		
		System.out.println(fact(n));

	}
	
	public static int fact(int n) {
		
		if(n<=1)
			return 1;
		
		return n*fact(n-1);
	}


}
