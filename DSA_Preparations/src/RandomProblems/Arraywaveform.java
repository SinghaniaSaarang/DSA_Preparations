package RandomProblems;

import java.util.Scanner;

public class Arraywaveform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Array size ");
		int n=input.nextInt();
		
		System.out.print("Enter Array Elements ");
		double array[]=new double[n];
		for(int i=0;i<n;i++)
			array[i]=input.nextDouble();
		
		printArray(array);
		waveform(array);
		printArray(array);
		
		
		
		
		

	}
	
	public static void printArray(double array[]) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
		System.out.println();
	}
	
	public static void waveform(double array[]) {
		int size=array.length;
		for(int i=1;i<size;i+=2) {
			if(array[i-1]>array[i])
				swap(array,i,i-1);
			
			if(i+1<size && array[i+1]>array[i])
				swap(array,i,i+1);
		}
	}
	
	public static void swap(double array[], int first,int second) {
		double temporary=array[first];
		array[first]=array[second];
		array[second]=temporary;
	}
	

}
