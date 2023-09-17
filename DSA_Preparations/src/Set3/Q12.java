package Set3;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n=input.nextInt();
		
		int a=0,b=1,j=2;
		for(int i=1;i<=n;i++) {
			
			if(i%2!=0) {
				if(i==1)
					System.out.print(b+" ");
				else {
					int sum=a+b;
					System.out.print(sum+" ");
					a=b;
					b=sum;
				}
			}else {
				int checker=0;
				
				while(checker==0) {
					if(primeCheck(j)) {
						System.out.print(j+" ");
						checker=1;
					}
					j++;
				}
			}
			
		}
	}
	
	public static boolean primeCheck(int n) {
		for(int i=n/2;i>1;i--) {
			if(n%i==0)
				return false;
		}
		return true;
	}

}
