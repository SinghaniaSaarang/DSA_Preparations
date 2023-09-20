package set4;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n=input.nextInt();
		
		while(n>0) {
			if(palindromecheck(n) && primecheck(n))
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
	
	public static boolean palindromecheck(int n) {
		
		String s=""+n;
		int slength=s.length()-1;
		
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(slength-i))
				return false;
		}
		return true;
	}

}
