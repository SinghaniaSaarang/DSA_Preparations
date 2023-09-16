package Set3;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter string: ");
		String str=input.next();
		
		int freq[]=new int[256];
		Arrays.fill(freq, 0);
		
		int unichar=0;
		for(int i=0;i<str.length();i++) {
			freq[(int)str.charAt(i)]++;
		}
		
		for(int i=0;i<256;i++)
			if(freq[i]==1)
				unichar++;
		
		System.out.print(unichar);
		
		

	}

}
