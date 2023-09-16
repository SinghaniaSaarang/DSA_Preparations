package Set3;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter n: ");
		int n=input.nextInt();
		
		System.out.print("Enter n Elements: ");
		int array[]=new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=input.nextInt();
		}
		
		Arrays.sort(array);
		
		for(int i=n-1;i>=0;i--) {
			System.out.print(array[i]);
		}
	}

}
