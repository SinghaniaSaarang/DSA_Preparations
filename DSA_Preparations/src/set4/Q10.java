package set4;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n=input.nextInt();
		n-=2;
		while(n>1) {
			if(primecheck(n+2) && primecheck(n))
				System.out.print(n+"&"+(n+2)+" ");
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
