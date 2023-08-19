package Sorting;

import java.util.Scanner;
public class Selectionsort {

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
		
		selectionsort(array);
		printarray(array);

	}
	
	public static void printarray(double[] array) {
		 
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void selectionsort(double array[]) {
		int pass,j;
		int largest=0;
		for(pass=array.length-1;pass>0;pass--) {
			largest=0;
			for(j=1;j<=pass;j++) {
				
				if(array[j]>array[largest])
					largest=j;
			}
			double temporary=array[largest];
			array[largest]=array[pass];
			array[pass]=temporary;
		}
	}

}
