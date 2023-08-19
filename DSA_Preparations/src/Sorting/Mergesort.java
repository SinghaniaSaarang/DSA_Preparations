package Sorting;

import java.util.Scanner;
public class Mergesort {

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
		
		mergesort(array,0,array.length-1);
		printarray(array);

	}
	
	public static void printarray(double[] array) {
		 
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void mergesort(double array[],int low,int high) {
		
		if(low<high) {
			int middle=(low+high)/2;
			
			mergesort(array,low,middle);
			mergesort(array,middle+1,high);
			merge(array,low,middle,high);
		}
	}
	
	public static void merge(double array[],int low,int middle,int high) {
		
		double arr1[]=new double[middle-low+1];
		double arr2[]=new double[high-middle];
		
		int i;
		for(i=0;i<middle-low+1;i++)
			arr1[i]=array[i+low];
		
		for(i=0;i<high-middle;i++)
			arr2[i]=array[middle+1+i];
		
		int arr1Lower=0,arr2Lower=0,lower=low;
		
		while(arr1Lower<middle-low+1 && arr2Lower<high-middle) {
			
			if(arr1[arr1Lower]<=arr2[arr2Lower]) {
				array[lower]=arr1[arr1Lower];
				arr1Lower++;
			}else {
				array[lower]=arr2[arr2Lower];
				arr2Lower++;
			}
			
			lower++;
		}
		
		while(arr1Lower<middle-low+1) {
			array[lower]=arr1[arr1Lower];
			arr1Lower++;
			lower++;
		}
		
		while(arr2Lower<high-middle) {
			array[lower]=arr2[arr2Lower];
			arr2Lower++;
			lower++;
		}
	}

}
