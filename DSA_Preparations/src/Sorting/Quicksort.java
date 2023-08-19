package Sorting;

import java.util.Scanner;
public class Quicksort {

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
		
		quicksort(array,0,array.length-1);
		printarray(array);

	}
	
	public static void printarray(double[] array) {
		 
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void quicksort(double array[],int low,int high) {
		
		if(low<high) {
			int divider=partition(array,low,high);
			
			quicksort(array,low,divider-1);
			quicksort(array,divider+1,high);
		}
	}
	
	public static int partition(double array[],int low,int high) {
		
		int lower=low,higher=high;
		double pivot=array[low];
		
		while(lower<higher) {
			
			while(lower<high && array[lower]<=pivot)
				lower++;
			
			while(higher>low && array[higher]>pivot)
				higher--;
			
			if(lower<higher) {
				double temporary=array[higher];
				array[higher]=array[lower];
				array[lower]=temporary;
			}
			
		}
		
		if(higher!=low) {
			double temporary=array[higher];
			array[higher]=array[low];
			array[low]=temporary;
		}
		
		return higher;
	}

}
