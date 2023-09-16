package Set2;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int length=input.nextInt();
		
		System.out.print("Enter Elements: ");
		int array[]=new int[length];
		
		for(int i=0;i<length;i++) {
			array[i]=input.nextInt();
		}
		
		System.out.print("Enter k rotatary places: ");
		int k=input.nextInt();
		
		reverse(array,0,length-1);
		reverse(array,0,length-1-k);
		reverse(array,length-k,length-1);
		
		for(int i=0;i<length;i++) {
			System.out.print(array[i]+" ");
		}

	}
	
	public static void reverse(int array[],int start,int end) {
		
		while(start<end) {
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start+=1;
			end-=1;
		}
		
	}

}
