package set4;

import java.util.Arrays;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print(sort("cbdadeaf"));

	}

	public static String sort(String str) {
		
		int charlength[]=new int[256];
		Arrays.fill(charlength, 0);
		
		String newstr="";
		
		for(int i=0;i<str.length();i++) {
			charlength[(int)str.charAt(i)]++;
		}
		
		for(int i=0;i<256;i++) {
			if(charlength[i]!=0) {
				while(charlength[i]-->0) {
					newstr+=(char)i;
				}
			}
		}
		return newstr;
	}
}
