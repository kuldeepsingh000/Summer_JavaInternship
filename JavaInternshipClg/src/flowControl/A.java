package flowControl;

import java.util.Scanner;

//Write a program to check if a given integer number is Positive, Negative, or Zero. 

public class A {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n>0)
		{
			System.out.println("Positive");
		}
		
		else if(n<0)
		{
			System.out.println("Negative");
		}
		
		else
		{
			System.out.println("Zero");
		}
	}
}
