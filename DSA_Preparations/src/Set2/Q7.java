package Set2;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str=input.nextLine();
		
		int freqcount[]=new int[256];
		
		Arrays.fill(freqcount, 0);
		
		for(int i=0;i<str.length();i++) {
			freqcount[(int)str.charAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)!=' ' && freqcount[(int)str.charAt(i)]!=0) {
				System.out.println(str.charAt(i)+": "+freqcount[(int)str.charAt(i)]);
				freqcount[(int)str.charAt(i)]=0;
			}
		}
		

	}

}
