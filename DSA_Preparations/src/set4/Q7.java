package set4;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter x and y: ");
		int x=input.nextInt();
		int y=input.nextInt();
		
		int sumx=0,sumy=0;
		for(int i=1;i<=x/2;i++)
			if(x%i==0)
				sumx+=i;
		
		for(int i=1;i<=y/2;i++)
			if(y%i==0)
				sumy+=i;
		
		if(sumx==y && sumy==x)
			System.out.print("Amicable");
		else
			System.out.print("Not AMicable");

	}

}
