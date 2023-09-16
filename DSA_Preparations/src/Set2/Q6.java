package Set2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=input.nextLine();
		
		for(int i=0;i<str.length();i++) {
			String substr="";
			for(int j=i;j<str.length();j++) {
				substr+=str.charAt(j);
				System.out.print(substr+" ");
			}
		}
		
		

	}

}
