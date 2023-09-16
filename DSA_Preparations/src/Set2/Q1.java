package Set2;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=input.next();
		
		reverseString(str);

	}

	public static void reverseString(String s) {
		if(s.length()==0)
			return;
		
		reverseString(s.substring(1));
		System.out.print(s.charAt(0));
		
	}
}
