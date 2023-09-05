package Patterns;

import java.util.Scanner;

public class Solidrombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner input=new Scanner(System.in);
			
			System.out.print("Enter number of rows: ");
			int rows=input.nextInt();
			
			for(int i=1;i<=rows;i++) {
				int columns=2*rows-i;
				for(int j=0;j<columns;j++) {
					if(j>=columns-rows) {
						System.out.print("*"+" ");
					}else {
						System.out.print(" "+" ");
					}
				}
				System.out.println();
			}

	}

}
