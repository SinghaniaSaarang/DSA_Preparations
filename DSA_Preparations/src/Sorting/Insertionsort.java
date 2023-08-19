package Sorting;

import java.util.Scanner;
public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Array size: ");
		int size=input.nextInt();
		
		double array[]=new double[size];
		
		System.out.print("Enter Array Elements: ");
		while(size-->0) {
			array[size]=input.nextDouble();
		}
		
		insertionsort(array);
		printarray(array);

	}
	
	public static void printarray(double[] array) {
		 
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void insertionsort(double array[]) {
		int pass,j;
		double temporary;
		for(pass=1;pass<array.length;pass++) {
			temporary=array[pass];
			for(j=pass;j>0;j--) {
				
				if(array[j-1]>temporary) {//swapping
					array[j]=array[j-1];
				}else {
					array[j]=temporary;
					break;
				}
				
			}
			if(j==0)
				array[j]=temporary;
		}
	}

}
