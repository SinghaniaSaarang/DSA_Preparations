package Set1;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter n*n size: ");
		int n=input.nextInt();
		
		System.out.println("Enter elements");
		int array[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				array[i][j]=input.nextInt();
		}
		
		
		for(int i=0;i<n;i++) {
			int sumrow=0,sumcolumn=0;
			for(int j=0;j<n;j++) {
				sumrow+=array[i][j];
				sumcolumn+=array[j][i];
			}
			System.out.println("row"+i+":- "+sumrow+" column"+i+":- "+sumcolumn);
		}
	}
	
	
	

}
