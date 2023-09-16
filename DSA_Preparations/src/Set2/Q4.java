package Set2;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=input.nextLine();
		
		String word="",line="";
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ') {
				line+=word+" ";
				word="";
			}else {
				word=str.charAt(i)+word;
			}
			
		}
		
		System.out.print(line+word);
		
	}

}
