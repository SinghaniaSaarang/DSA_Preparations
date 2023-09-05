package RecursionsPractice;

import java.util.Scanner;

public class Occurence {

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
		
		System.out.print("Key: ");
		int key=sc.nextInt();
		
		System.out.println(first(arr,0,key));
		System.out.println(last(arr,n-1,key));

	}
	
	public static int last(int arr[],int n,int key) {
		
		if(n==-1)
			return -1;
		
		if(arr[n]==key)
			return n;
		
		return last(arr,n-1,key);
	}
	
	public static int first(int arr[],int n,int key) {
		
		if(n==arr.length)
			return -1;
		
		if(arr[n]==key)
			return n;
		
		return first(arr,n+1,key);
	}
	

}
