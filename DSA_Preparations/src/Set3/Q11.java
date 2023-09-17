package Set3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n=input.nextInt();
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		while(n!=0) {
			al.add(n%10);
			n/=10;
		}
		
		Collections.sort(al);
		
		for(int i=0;i<al.size();i++) {
			if(al.get(i)!=0) {
				System.out.print(al.get(i));
				al.remove(i);
				break;
			}
		}
		
		for(int i=0;i<al.size();i++)
			System.out.print(al.get(i));
		

	}

}
