package RecursionsPractice;

import java.util.Scanner;

public class Arraysorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Size of array: ");
		int n=sc.nextInt();
		
		System.out.print("Enter array elemnets: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print(sorted(arr,n-1));

	}
	
	public static boolean sorted(int arr[],int i) {
		
		if(i==0)
			return true;
		
		return arr[i]>arr[i-1] && sorted(arr,i-1);
	}

}
