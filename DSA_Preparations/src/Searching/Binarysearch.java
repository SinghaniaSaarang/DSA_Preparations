package Searching;

import java.util.Scanner;
public class Binarysearch {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Array size: ");
		int size=input.nextInt();
		
		double array[]=new double[size];
		
		System.out.print("Enter Array Elements: ");
		while(size-->0) {
			array[size]=input.nextDouble();
		}
		
		System.out.print("Element to search: ");
		double searchelement=input.nextDouble();
		
		System.out.print("Element present: "+binarysearch(array,searchelement));
		
		
	}
	
	public static boolean binarysearch(double array[],double searchelement) {
		
		int lowerpoint=0,higherpoint=array.length-1,middle;
		
		while(lowerpoint<=higherpoint) {
			middle=(lowerpoint+higherpoint)/2;
			
			if(array[middle]==searchelement)
				return true;
			else if(array[middle]>searchelement)
				higherpoint=middle-1;
			else
				lowerpoint=middle+1;
		}
		
		return false;
	}

}

