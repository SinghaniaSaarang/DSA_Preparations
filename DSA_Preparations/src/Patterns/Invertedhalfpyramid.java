package Patterns;

import java.util.Scanner;

public class Invertedhalfpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int rows=input.nextInt();
		
		for(int i=rows-1;i>=0;i--) {
			for(int j=i;j>=0;j--)
				System.out.print("*"+" ");
			System.out.println();
		}

	}


}
