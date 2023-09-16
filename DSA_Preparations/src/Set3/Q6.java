package Set3;

import java.util.Scanner;
import java.util.HashSet;

public class Q6 {

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
		
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<n;i++) {
			if(hs.contains(array[i])) {
				System.out.print(array[i]);
				break;
			}
			hs.add(array[i]);
		}
		
	}

}
