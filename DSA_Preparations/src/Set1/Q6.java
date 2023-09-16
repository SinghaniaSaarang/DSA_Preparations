package Set1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number=input.nextInt();
		
		int sum=0;
		while(number>=10) {
			sum+=number%10;
			number=number/10;
		}
		System.out.println(sum);

	}

}
