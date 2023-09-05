package RecursionsPractice;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n");
		int n=input.nextInt();
		
		inc(n);
		dec(n);

	}
	
	public static void inc(int n) {
		
		if(n==0)
			return;
		
		inc(n-1);
		System.out.println(n);
	}
	
	public static void dec(int n) {
		
		if(n==0)
			return;
		
		System.out.println(n);
		dec(n-1);
	}

}
