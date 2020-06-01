package arrayBasics19Q;

import java.util.Scanner;

//4.	WAP  to assign a set of numbers in an Array and display it is Reverse.

public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		
		int l = arr.length;
		
		for(int i=l-1; i>=0; i--)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
