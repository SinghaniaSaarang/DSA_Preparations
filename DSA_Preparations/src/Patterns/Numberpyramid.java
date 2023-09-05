package Patterns;

import java.util.Scanner;

public class Numberpyramid {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int rows=input.nextInt();
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows-1-i;j++) {
					System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++) {
				System.out.print(i+" ");
		}
			System.out.println();
		}

	}

}
