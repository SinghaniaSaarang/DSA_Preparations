package RecursionsPractice;

import java.util.Scanner;

public class Tilesplacing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter columns");
		int n=input.nextInt();
		
		System.out.print(tileplacing(n));
		

	}
	
	public static int tileplacing(int n) {
		if(n==0) {
			return 0;
		}
		
		if(n==1) {
			return 1;
		}
		
		return tileplacing(n-1)+tileplacing(n-2);
				
	}
	
	

}
