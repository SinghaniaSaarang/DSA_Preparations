package RecursionsPractice;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=sc.next();
		
		substrascii(str,"");

	}

	public static void substr(String str,String newstr) {
		// TODO Auto-generated method stub
		if(str.length()==0){
			System.out.println(newstr);
			return;
		}
		
		substr(str.substring(1),newstr);
		substr(str.substring(1),newstr+str.charAt(0));
		
	}
	
	public static void substrascii(String str,String newstr) {
		// TODO Auto-generated method stub
		if(str.length()==0){
			System.out.println(newstr);
			return;
		}
		
		substrascii(str.substring(1),newstr);
		substrascii(str.substring(1),newstr+str.charAt(0));
		substrascii(str.substring(1),newstr+(int)str.charAt(0));
		
	}


}
