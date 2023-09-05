package RecursionsPractice;

import java.util.Scanner;

public class Xpowerp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n and power p");
		int n=input.nextInt();
		int p=input.nextInt();
		
		System.out.println(power(n,p));

	}
	
	public static int power(int n,int p) {
		
		if(p==1)
			return n;
		
		if(p%2==0)
			return power(n,p/2)*power(n,p/2);
		else
			return n*power(n,p/2)*power(n,p/2);
	}

}
