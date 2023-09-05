package RecursionsPractice;

import java.util.Scanner;

public class Towerofhanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter number of discs: ");
		int n=input.nextInt();
		
		toh(n,"source","destination","helper");
		
		

	}
	
	public static void toh(int n,String source,String destination,String helper) {
		
		if(n<=0)
			return;
		
		toh(n-1,source,helper,destination);
		System.out.println(source+"->"+destination);
		toh(n-1,helper,destination,source);
	}

}
