package Set1;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a and b: ");
		int a=input.nextInt();
		int b=input.nextInt();
		
		System.out.println(consecutiveFib(a,b));

	}
	
	public static boolean consecutiveFib(int a,int b) {
		int first=0,second=1;
		int sum=first+second;
		
		if(first==a && second==b)
			return true;
		
		while(sum<=b ) {
			first=second;
			second=sum;
			
			if(first==a && second==b)
				return true;
			sum=first+second;
			
		}
		return false;
	}

}
