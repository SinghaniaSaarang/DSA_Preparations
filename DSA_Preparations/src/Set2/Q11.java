package Set2;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int length=input.nextInt();
		
		System.out.print("Enter Elements: ");
		int array[]=new int[length];
		
		for(int i=0;i<length;i++) {
			array[i]=input.nextInt();
		}
		
		System.out.print("Enter rows: ");
		int row=input.nextInt();
		
		System.out.print("Enter Column: ");
		int column=input.nextInt();
		
		if(row*column!=length)
			throw new Exception("Wrong inputs row or column!");
		
		length=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++)
				System.out.print(array[length++]+" ");
			System.out.println();
		}

	}

}
