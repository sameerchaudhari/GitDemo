package programs;

import java.util.Scanner;

public class fibonacciSeries {
	public static void main(String[] args) {
		
		//0 1 1 2 3 5 8 13
		
		int a=0,b=1,c;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the number of terms:");
		int term = scn.nextInt();
		
		System.out.println("fibonacci series :");
		
		for(int i =1;i<=term;i++)
		{
			System.out.println(a +"");
			
			c= a+b;
			a=b;
			b=c;
		}
	}

}
