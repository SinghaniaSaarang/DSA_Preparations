package RecursionsPractice;

import java.util.Scanner;

public class Countpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter starting and ending point: ");
		int start=input.nextInt();
		int end=input.nextInt();
		
		System.out.print(pathcount(start,end));
		
		
		
	}
	
	public static int pathcount(int start,int end) {
		
		if(start>end)
			return 0;
		if(start==end)
			return 1;
		
		int totalpaths=0;
		for(int i=1;i<7;i++) {
			totalpaths+=pathcount(start+i,end);
		}
		return totalpaths;
	}

}
