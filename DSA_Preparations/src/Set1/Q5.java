package Set1;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number=input.nextInt();
		
//		boolean div=(number&1)==1?false:true;
		System.out.println((number&1)==1?false:true);

	}

}
