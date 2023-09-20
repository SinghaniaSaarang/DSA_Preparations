package set4;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n for sq. Matrix: ");
		int n=input.nextInt();
		
		int array2d[][]=new int[n][n];
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				array2d[i][j]=input.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				int temp=array2d[i][j];
				array2d[i][j]=array2d[j][i];
				array2d[j][i]=temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
				System.out.print(array2d[i][j]+" ");
			System.out.println();
		}
	}

}
