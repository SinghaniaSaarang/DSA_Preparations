package set4;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n=input.nextInt();
		
		while(n>0) {
			if(divisorSum(n)==n)
				System.out.print(n+" ");
			n--;
		}
		

	}
	
	public static int divisorSum(int n) {
	
		int sum=0;
		for(int i=1;i<=n/2;i++)
			if(n%i==0)
				sum+=i;
		
		return sum;
	}

}
