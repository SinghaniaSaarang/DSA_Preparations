package Set1;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter size of array");
		int size=input.nextInt();
		
		System.out.print("Enter sorted Array");
		int arr[]=new int[size];
		
		for(int i=0;i<size;i++) {
			int entry=input.nextInt();
			if(i>0&&entry<arr[i-1])
				throw new Exception("Unsorted aarray");
			else
				arr[i]=entry;
			
		}
		
		removeduplicates(arr);
		
		

	}
	
	public static void removeduplicates(int a[]) {
		int i;
		for(i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println(a[i]);
	}

}
