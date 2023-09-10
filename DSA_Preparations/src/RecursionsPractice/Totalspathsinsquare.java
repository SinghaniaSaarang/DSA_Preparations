package RecursionsPractice;

import java.util.Scanner;

public class Totalspathsinsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n");
		int n=input.nextInt();
		
		System.out.print(totalpaths(0,0,n));

	}
	
	public static int totalpaths(int x,int y,int n) {
		if(x==n-1 && y==n-1) {
			return 1;
		}
		
		if(x==n || y==n) {
			return 0;
		}
		
		return totalpaths(x+1,y,n) + totalpaths(x,y+1,n);
	}

}
