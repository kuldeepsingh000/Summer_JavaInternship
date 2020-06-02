package arrayBasics19Q;

import java.util.Scanner;

//11.	WAP to accept N integers from user and Count how many of them are positive.

public class Q11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		
		int count = 0;
		for(int i = 0; i<n; i++)
		{
			if(array[i] > 0)
			{
				count++;
			}
		}
		
		System.out.println(count);
	}

}
