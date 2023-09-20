package set4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n=input.nextInt();
		
		String num="";
		while(n!=0) {
			num+=n%10;
			n/=10;
		}
		
		System.out.print(Integer.parseInt(num));

	}

}
