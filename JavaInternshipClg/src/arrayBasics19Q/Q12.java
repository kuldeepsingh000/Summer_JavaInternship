package arrayBasics19Q;

import java.util.Scanner;

//12.WAP to accept N integers from user and find average of Even elements present in it.

public class Q12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
			
		int sum =0;
		int c = 0;
		
		for(int i = 0; i<n; i++)
		{
			if(arr[i] % 2 == 0)
			{
				sum += arr[i];
				c++;
			}
		}
		
		System.out.println("The average of even numbers is : " + (sum/c));
		sc.close();
	}

}
