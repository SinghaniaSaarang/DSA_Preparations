package Set1;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter String: ");
		String str=input.next();
		
		permutation(str,"");

	}
	
	public static void permutation(String str, String newstr) {
		if(str.length()==0) {
			System.out.println(newstr);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			permutation(str.substring(0, i)+str.substring(i+1),newstr+str.charAt(i));
		}
	}
}
