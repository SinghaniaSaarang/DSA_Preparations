package Set3;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n=input.nextInt();
		
		System.out.print("Enter k: ");
		int k=input.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			if(n%i==0)
				k--;
			if(k==0) {
				System.out.println(i);
				break;
			}
		}
		
		if(k!=0)
			System.out.println("Not possible!");

	}

}
