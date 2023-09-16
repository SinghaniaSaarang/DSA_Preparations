package Set3;

import java.util.Scanner;

public class Q8 {

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
		
		System.out.println(binarySearch(array,element));
		

	}
	
	public static int binarySearch(int array[],int element) {
		int l=0,h=array.length-1,m;
		
		
		while(l<=h) {
			m=(h+l)/2;
			if(array[m]==element)
				return m;
			else if(array[m]>element)
				h=m-1;
			else
				l=m+1;
		}
		
		return -1;
	}

}
