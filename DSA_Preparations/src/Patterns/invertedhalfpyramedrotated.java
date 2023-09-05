package Patterns;

import java.util.Scanner;

public class invertedhalfpyramedrotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int rows=input.nextInt();
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				if(rows-1-i<=j)
					System.out.print("*"+" ");
				else
					System.out.print(" "+" ");
			}
			System.out.println();
		}

	}


}
