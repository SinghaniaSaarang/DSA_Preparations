package Sorting;

import java.util.Scanner;
public class Bubblesort {

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
		
		bubblesort(array);
		printarray(array);

	}
	
	public static void printarray(double[] array) {
		 
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void bubblesort(double array[]) {
		int pass,j;
		for(pass=0;pass<array.length-1;pass++) {
			int change=0;
			for(j=0;j<array.length-1-pass;j++) {
				
				if(array[j]>array[j+1]) {//swapping
					double temporary=array[j];
					array[j]=array[j+1];
					array[j+1]=temporary;
					change++;
				}
				
			}
			if(change==0)
				break;
		}
	}

}
