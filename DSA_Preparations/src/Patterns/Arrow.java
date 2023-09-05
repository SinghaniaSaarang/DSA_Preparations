package Patterns;

import java.util.Scanner;

public class Arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner input=new Scanner(System.in);
			
			System.out.print("Enter number of rows: ");
			int rows=input.nextInt();
			
			System.out.print("Enter number of columns: ");
			int columns=input.nextInt();
			
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					if(j<=i || j>=columns-i-1)
						System.out.print("*"+" ");
					else
						System.out.print(" "+" ");
				}
				System.out.println();
			}
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					if(j<=i || j>=columns-i-1)
						System.out.print(" "+" ");
					else
						System.out.print("*"+" ");
				}
				System.out.println();
			}

	}


}
