package Set2;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=input.next();
		
		palindromeChecker(str);

	}

	public static void palindromeChecker(String s) {
		
		for(int i=0;i<s.length()/2;i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				System.out.print("Not a Palindrome");
				return;
			}
		}
		
		System.out.print("palindrome");
		

	}

}
