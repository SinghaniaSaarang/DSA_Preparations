package RecursionsPractice;

import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=sc.next();
		
		reverse(str);

	}

	public static void reverse(String str) {
		// TODO Auto-generated method stub
		
		if(str.length()==0)
			return;
		
		reverse(str.substring(1));
		System.out.print(str.charAt(0));
		
		
		
	}

}
