package Set2;

import java.util.Scanner;

public class Q10 {

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
		
		System.out.println(thirdLargest(array));

	}
	
	public static int thirdLargest(int array[]) {
		
		if(array.length==1)
			return array[0];
		else if(array.length==2) {
			if(array[0]>array[1])
				return array[1];
			else
				return array[0];
		}else {
			int largest1,largest2,largest3;
			
			largest1=Math.max((Math.max(array[0], array[1])), array[2]);
			largest3=Math.min((Math.min(array[0], array[1])), array[2]);
			largest2=array[0]+array[1]+array[2]-largest1-largest3;
			
			for(int i=3;i<array.length;i++) {
				if(array[i]>largest1) {
					largest3=largest2;
					largest2=largest1;
					largest1=array[i];
				}else if(array[i]>largest2) {
					largest3=largest2;
					largest2=array[i];
				}else if(array[i]>largest3){
					largest3=array[i];
				}
			}
			return largest3;
		}
	}

}
