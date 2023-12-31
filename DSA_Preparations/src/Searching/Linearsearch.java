package Searching;
import java.util.Scanner;
public class Linearsearch {

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
		
		System.out.print("Element present: "+linearsearch(array,searchelement));
		
		
	}
	
	public static boolean linearsearch(double array[],double searchelement) {
		
		int size=array.length;
		while(size-->0) {
			if(array[size]==searchelement)
				return true;
		}
		return false;
	}

}
