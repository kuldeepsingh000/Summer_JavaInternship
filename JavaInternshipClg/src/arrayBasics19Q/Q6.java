package arrayBasics19Q;

import java.util.Scanner;

//6.	WAP to accept 10 numbers in an array and search a given number,  
//if the number exists display its position (index) else display a suitable message.(Linear Search)

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in array : ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter the elements you want to search : ");
		int s = sc.nextInt();
		int c = 0;
		for(int i = 0; i<n; i++)
		{
			if(s == arr[i])
			{
				c++;
			}
		}
		
		if(c == 1)
		{
			System.out.println("Value is present");
		}else {
			System.out.println("Value is not present");
		}

	}

}
