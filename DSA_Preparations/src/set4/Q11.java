package set4;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a and b: ");
		int a=input.nextInt();
		int b=input.nextInt();

		System.out.print("Enter c and d: ");
		int c=input.nextInt();
		int d=input.nextInt();

		int lcm=(b*d)/gcd(b,d);
		
		int sum=a*(lcm/b)+c*(lcm/d);
		
		for(int i=Math.min(sum, lcm);i>=2;i--) {
			if(sum%i==0 && lcm%i==0) {
				sum/=i;
				lcm/=i;
			}
		}
		System.out.print(sum+"/"+lcm);
		

	}
	
	public static int gcd(int x,int y) {
		
		if(x%y==0) {
			return y;
		}else {
			return gcd(y,x%y);
		}
	}

}
