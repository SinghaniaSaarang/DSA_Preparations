package Set3;

import java.util.Scanner;

public class Q7 {

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
		
		System.out.print("Enter k: ");
		int k=input.nextInt();
		
		System.out.print(kthSmallest(array,k));

	}
	
	public static int kthSmallest(int array[],int k) {
		
		for(int i=0;i<k;i++) {
			for(int j=0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				
			}
		}
		return array[k-1];
	}
	

}
