package set4;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n=input.nextInt();
		
		String octa="";
		while(n!=0) {
			octa=n%8+octa;
			n/=8;
		}
		
		System.out.print(octa);

	}

}
