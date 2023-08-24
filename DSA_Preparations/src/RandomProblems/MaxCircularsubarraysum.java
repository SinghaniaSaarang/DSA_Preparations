package RandomProblems;

import java.util.Scanner;

public class MaxCircularsubarraysum {

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
		System.out.print("Maximum Circular Subarray Sum: "+ circulararraysum(array));
		
		
		
		

	}
	
	public static void printArray(double array[]) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
		System.out.println();
	}
	
	public static double circulararraysum(double array[]) {
		double summin=0,summax=0,finalmaxsum=0,finalminsum=0,totalsum=0;
		for(int i=0;i<array.length;i++) {
			summax+=array[i];
			summin+=array[i];
			totalsum+=array[i];
			
			if(summax<0)
				summax=0;
			
			if(summin>0)
				summin=0;
			
			if(finalmaxsum<summax)
				finalmaxsum=summax;
			
			if(finalminsum>summin)
				finalminsum=summin;
		}
		
		
		return Math.max(finalmaxsum, totalsum-finalminsum);
				
	}

}
