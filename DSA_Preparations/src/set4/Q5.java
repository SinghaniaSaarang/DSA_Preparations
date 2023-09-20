package set4;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter x and y: ");
		int x=input.nextInt();
		int y=input.nextInt();
		
		System.out.println(gcd(x,y));

	}
	
	public static int gcd(int x,int y) {
		
		if(x%y==0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}

}
