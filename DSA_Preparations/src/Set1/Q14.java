package Set1;

import java.util.Arrays;
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int n=input.nextInt();
		
		int freqcount[]=new int[10];
		Arrays.fill(freqcount, 0);
		
		while(n!=0) {
			freqcount[n%10]++;
			n/=10;
		}
		
		int oddcount=0;
		while(n<10) {
			if(freqcount[n]%2!=0)
				oddcount++;
			n++;
		}
		
		System.out.print(oddcount>1?"No":"yes");
		
	}

}
