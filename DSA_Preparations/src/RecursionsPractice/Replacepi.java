package RecursionsPractice;

import java.util.Scanner;

public class Replacepi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=sc.next();
		
		pi(str);

	}
	
	public static void pi(String str) {
		if(str.length()==0)
			return;
		
		if(str.length()==1) {
			System.out.print(str.charAt(0));
			return;
		}
		
		if(str.charAt(0)=='p' && str.charAt(1)=='i') {
			System.out.print(3.14);
			pi(str.substring(2));
		}else {
			System.out.print(str.charAt(0));
			pi(str.substring(1));
		}
	}

}
