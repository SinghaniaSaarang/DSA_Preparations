package RandomProblems;

import java.util.Scanner;

public class LargestSumcontigousSubarray {

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
		System.out.print("Maximum Contigous Subarray Sum: "+ contigousarraysum(array));
		
		
		
		

	}
	
	public static void printArray(double array[]) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
		System.out.println();
	}
	
	public static double contigousarraysum(double array[]) {
		int sum=0,maxsum=0;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
			
			if(sum<0)
				sum=0;
			
			if(maxsum<sum)
				maxsum=sum;
		}
		
		return maxsum;
				
	}

}
