package Set1;

import java.util.Arrays;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=input.next();
		
		minmaxCharacter(s);

	}
	
	public static void minmaxCharacter(String s) {
		
		int freqcount[]=new int[256];
		
		Arrays.fill(freqcount, 0);
		
		for(int i=0;i<s.length();i++) {
			freqcount[(int)s.charAt(i)]++;
		}
		
		int maxoccur=0,minoccur=0;
		
		for(int i=0;i<256;i++) {
			if(freqcount[i]>freqcount[maxoccur]) 
				maxoccur=i;
		}
		
		minoccur=maxoccur;
		for(int i=0;i<256;i++) {
			if(freqcount[i]<freqcount[minoccur] && freqcount[i]!=0) 
				minoccur=i;
		}
		
		System.out.print("Max: "+(char)maxoccur+" Min: "+(char)minoccur);
	}

}
