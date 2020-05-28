package pattern;

import java.util.Scanner;

/*1.	WAP to print the word “JAVA” in following pattern-
		J
		JA
		JAV
		JAVA*/

public class Q1Java{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		for(int i = 0; i<s.length(); i++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print(s.charAt(j) + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
