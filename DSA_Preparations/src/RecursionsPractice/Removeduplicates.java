package RecursionsPractice;

import java.util.Scanner;

public class Removeduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=sc.next();
		
		repeatingduplicate(str);

	}
	
	public static void repeatingduplicate(String str) {
		
		if(str.length()==1) {
			System.out.print(str.charAt(0));
			return;
		}
		
		if(str.charAt(0)!=str.charAt(1)) {
			System.out.print(str.charAt(0));	
		}
		repeatingduplicate(str.substring(1));
	}

}
