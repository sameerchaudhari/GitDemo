package programs;

import java.util.Scanner;

public class primeNumber {
	
	public static void main(String[] args) {
		
		int n,count=0;
		
		System.out.println("Enter Any Number:");
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		
		for(int i = 1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==2) {
			System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Not a Prime number");
		}
	}

}
