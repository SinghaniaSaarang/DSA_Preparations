package Set3;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("enter n: ");
		int n=input.nextInt();
		
		for(int i=n/2;i>0;i--) {
			if(n%i==0 && factorialNumber(i)) {
				System.out.print(i);
				break;
			}
		}

	}
	
	public static boolean factorialNumber(int n) {
		
		int mul=1;
		
		for(int i=1;mul<=n;i++) {
			mul*=i;
			
			if(mul==n)
				return true;
		}
		return false;
	}

}
