package Set1;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int length=input.nextInt();
		
		System.out.print("Enter elements");
		int array[]=new int[length];
		
		for(int i=0;i<length;i++) {
			array[i]=input.nextInt();
		}
		
		seprate(array);
		
		for(int i=0;i<length;i++) {
			System.out.print(array[i]+" ");
		}
		
		

	}

	public static void seprate(int array[]) {
		
		int low=0,high=array.length-1;
		
		while(low<high) {
			
			while(array[low]<0) {
				low++;
			}
			
			while(array[high]>=0) {
				high--;
			}
			
			if(low<high) {
				int temp=array[low];
				array[low]=array[high];
				array[high]=temp;
			}
		}
		
		
	}
}
