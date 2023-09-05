package RecursionsPractice;

import java.util.Scanner;

public class Permutationstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=sc.next();
		
		perm(str,"");

	}

	public static void perm(String str,String newstr) {
		// TODO Auto-generated method stub
		
		if(str.length()==0) {
			System.out.println(newstr);
			return;
		}
			
		for(int i=0;i<str.length();i++) {
			perm(str.substring(0, i)+str.substring(i+1), newstr+str.charAt(i));
		}
		
		
		

	}

}
