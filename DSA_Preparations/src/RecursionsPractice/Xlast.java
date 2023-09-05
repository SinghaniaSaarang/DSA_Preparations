package RecursionsPractice;

import java.util.Scanner;

public class Xlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=sc.next();
		
		movex(str);

	}

	public static void movex(String str) {
		// TODO Auto-generated method stub
		
		if(str.length()==0)
			return;
		
		if(str.charAt(0)!='x') {
			System.out.print(str.charAt(0));
			movex(str.substring(1));
		}else {
			movex(str.substring(1));
			System.out.print(str.charAt(0));
		}
		

	}

}
