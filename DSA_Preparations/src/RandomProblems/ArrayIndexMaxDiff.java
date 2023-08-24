package RandomProblems;

import java.util.Scanner;

public class ArrayIndexMaxDiff {

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
		System.out.print("Max-Difference: "+ maxdiff(array));

	}
	
	public static void printArray(double array[]) {
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
		System.out.println();
	}
	
	public static int maxdiff(double array[]) {
		int size=array.length;
		double leftmin[]=new double[size];
		double rightmax[]=new double[size];
		
		int i;
		
		leftmin[0]=array[0];
		for(i=1;i<size;i++) {
			if(leftmin[i-1]<array[i])
				leftmin[i]=leftmin[i-1];
			else
				leftmin[i]=array[i];
		}
		
		rightmax[size-1]=array[size-1];
		for(i=size-2;i>=0;i--) {
			if(rightmax[i+1]>array[i])
				rightmax[i]=rightmax[i+1];
			else
				rightmax[i]=array[i];
		}
		
		int maxdiff=-1,j=0;
		i=0;
		
		while(i<size && j<size) {
			if(leftmin[i]<rightmax[j]) {
				maxdiff=Math.max(maxdiff, j-i);
				j++;
			}else
				i++;
		}
		return maxdiff;
	}

}
