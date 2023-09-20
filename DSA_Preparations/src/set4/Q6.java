package set4;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n=input.nextInt();
		
		while(n>1) {
			if(primecheck(n))
				System.out.print(n+" ");
			n--;
		}
	}
	
	public static boolean primecheck(int n) {
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
