package Set3;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter size of Array: ");
		int length=input.nextInt();
		
		System.out.print("Enter Array Elements: ");
		int array[]=new int[length];
		
		for(int i=0;i<length;i++) {
			array[i]=input.nextInt();
		}
		
		System.out.print("Enter element to search: ");
		int element=input.nextInt();
		
		
		int newarr[]=searchDelete(array,element);
		
		for(int i=0;i<newarr.length;i++) {
			System.out.print(newarr[i]+" ");
		}
		

	}
	
	public static int[] searchDelete(int array[], int element) {
		
		int searchfound=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==element)
				searchfound++;
		}
		
		int newarr[]=new int[array.length-searchfound];
		int j=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]!=element)
				newarr[j++]=array[i];
		}
		return newarr;
		
	}

}
