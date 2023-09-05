package RecursionsPractice;

import java.util.Scanner;

public class Sumofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n");
		int n=input.nextInt();
		
		System.out.println(sum(n));

	}
	
	public static int sum(int n) {
		
		if(n==0)
			return 0;
		
		return n+sum(n-1);
	}

}
