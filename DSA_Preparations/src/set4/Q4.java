package set4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int n=input.nextInt();
		
		if(n==1) {
			System.out.print(1);
		}else {
			while(n!=1) {
				
				int i=2;
				while(n%i!=0) {
					i++;
				}
				System.out.print(i+" ");
				n/=i;
				
			}
		}
		


	}

}
