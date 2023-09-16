package Set2;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n=input.nextInt();
		
		int pcheck=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.print("Not a prime");
				pcheck=1;
				break;
			}
		}
		
		if(pcheck==0)
			System.out.print("Prime");
		

	}

}
