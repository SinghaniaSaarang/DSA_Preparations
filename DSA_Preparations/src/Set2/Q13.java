package Set2;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n=input.nextInt();
		
		int sum=0;
		
		for(int i=1;i<2*n;i+=2) {
			if(i%4==1)
				sum+=i;
			else
				sum-=i;
		}
		
		System.out.print(sum);
	}

}
