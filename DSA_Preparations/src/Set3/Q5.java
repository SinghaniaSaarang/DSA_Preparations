package Set3;

import java.util.Scanner;
import java.util.HashSet;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter n: ");
		int n=input.nextInt();
		
		System.out.print("Enter n Elements: ");
		int array[]=new int[n];
		
		for(int i=0;i<n;i++) {
			array[i]=input.nextInt();
		}
		
		System.out.print("Enter sum");
		int sum=input.nextInt();
		
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<array.length;i++) {
			if(hs.contains(sum-array[i]))
				System.out.println(array[i]+" "+(sum-array[i]));
			hs.add(array[i]);
		}
	}

}
