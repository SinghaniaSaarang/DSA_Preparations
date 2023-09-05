package Patterns;

import java.util.Scanner;

public class Palindromicpattern {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int rows=input.nextInt();
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows-1-i;j++) {
					System.out.print(" "+" ");
			}
			
			for(int j=i;j>=0;j--) {
				System.out.print(j+" ");
		}
			
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
		}
			System.out.println();
		}

	}

}
