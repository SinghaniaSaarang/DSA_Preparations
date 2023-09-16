package Set1;

import java.util.Scanner;

public class Q7 {

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
		
		System.out.println(secondLargest(array,length));

	}
	
	public static int secondLargest(int array[],int length) {
		
		if(length==1)
			return array[0];
		else {
			int largest1,largest2;
			if(array[0]>array[1]) {
				largest1=array[0];
				largest2=array[1];
			}else {
				largest1=array[1];
				largest2=array[0];
			}
			
			for(int i=2;i<length;i++) {
				if(array[i]>largest1) {
					largest2=largest1;
					largest1=array[i];
				}else if(array[i]>largest2)
					largest2=array[i];
			}
			return largest2;
		}
	}

}
