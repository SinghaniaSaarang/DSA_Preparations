package Set3;

import java.util.Scanner;
import java.util.HashMap;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.print("enter size of Array: ");
		int length=input.nextInt();
		
		System.out.print("Enter Array Elements: ");
		int array[]=new int[length];
		
		for(int i=0;i<length;i++) {
			array[i]=input.nextInt();
		}
		
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		
		for(int i=0;i<length;i++) {
			if(hs.containsKey(array[i])) {
				hs.put(array[i], hs.get(array[i])+1);
			}else
				hs.put(array[i], 1);
		}
		
		System.out.print(hs);
		
		
	}

}
