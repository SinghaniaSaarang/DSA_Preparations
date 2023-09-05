package RecursionsPractice;

import java.util.Scanner;

public class Keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter string");
		String str=input.next();
		
		keypad(str,"");
		
		
	}
	
	public static void keypad(String str,String newstr) {
		
		if(str.length()==0) {
			System.out.println(newstr);
			return;
		}
		
		String pads[]= {"./","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
		int num=str.charAt(0)-'0';
		
		for(int i=0;i<pads[num].length();i++) {
			keypad(str.substring(1),newstr+pads[num].charAt(i));
		}
	}
	

}
