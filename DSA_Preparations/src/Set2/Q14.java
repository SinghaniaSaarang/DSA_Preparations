package Set2;

import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n=input.nextInt();
		
		if(n<1)
			throw new Exception("Not possible!");
		
		int a=0,b=1;
		
		if(n==1)
			System.out.print(a);
		else if(n==2)
			System.out.print(a+" "+b);
		else {
			System.out.print(a+" "+b+" ");
			int sum=a+b;
			
			for(int i=3;i<=n;i++) {
				System.out.print(sum+" ");
				a=b;
				b=sum;
				sum=a+b;
			}
		}

	}

}
