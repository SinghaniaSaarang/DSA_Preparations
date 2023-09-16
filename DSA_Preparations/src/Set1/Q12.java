package Set1;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter X: ");
		int x=input.nextInt();
		
		int notesreq=0;
		
		notesreq+=x/100;
		x=x%100;
		notesreq+=x/50;
		x=x%50;
		notesreq+=x/20;
		x=x%20;
		notesreq+=x/10;
		x=x%10;
		notesreq+=x/5;
		x=x%5;
		notesreq+=x/2;
		x=x%2;
		notesreq+=x;
		
		System.out.println(notesreq);

	}

}
