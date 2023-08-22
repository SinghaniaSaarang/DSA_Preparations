package RandomProblems;

import java.util.Scanner;
public class RotateArraybykpoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter Array size ");
		int n=input.nextInt();
		
		System.out.print("Enter Array Elements ");
		double array[]=new double[n];
		for(int i=0;i<n;i++)
			array[i]=input.nextDouble();
		
		System.out.print("Enter rotating points ");
		int k=input.nextInt();
		
		printArray(array);
		reverse(array,0,n-1);
		reverse(array,0,n-k-1);
		reverse(array,n-k,n-1);
		printArray(array);
		
		

	}
	
	public static void printArray(double array[]) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
		System.out.println();
	}
	
	public static void reverse(double[] array,int start,int end) {
		for(int i=0;i<=(end-start)/2;i++) {
			double temporary=array[start+i];
			array[start+i]=array[end-i];
			array[end-i]=temporary;
		}
	}

}
