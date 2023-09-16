package Set2;

import java.util.Scanner;
import java.util.HashSet;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=input.nextLine();
		
		System.out.print(uniqueCharacters(str));
		

	}
	
	public static String uniqueCharacters(String s) {
		
		String str="";
		
		HashSet<Character> hs=new HashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			if(!hs.contains(s.charAt(i))) {
				hs.add(s.charAt(i));
				str+=s.charAt(i);
			}
		}
		return str;
	}

}
