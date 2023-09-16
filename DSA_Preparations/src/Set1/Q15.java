package Set1;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("Enter number of rows: ");
		int n=input.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			for(int j=1;j<=n-i;j++)
				System.out.print(" "+" ");
			
			for(int j=i;j>0;j--)
				System.out.print(j+" ");
			
			for(int j=i-1;j>0;j--)
				System.out.print((char)(64+j)+" ");
			
			System.out.println();
		}

	}

}
