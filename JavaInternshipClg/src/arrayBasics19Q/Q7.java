package arrayBasics19Q;

import java.util.Scanner;

//7.	WAP to accept 5 numbers in an array and search a given number. 
//If the number exists display its frequency else display a suitable message.

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in array from 1 to 100 only : ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter the elements you want to search : ");
		int s = sc.nextInt();
		
		int [] f = new int[100];
		for(int e : arr)
		{
			f[e-1]++;
		}
		
		boolean ok = false;
		for(int i=0; i<n; i++)
		{
			if(s == arr[i]) {
				ok = true;
			}
		}
		
		if(ok)
		{
			System.out.println("The element is present is array and it's frequency is " + f[s-1]);
		}else {
			System.out.println("The element is not present is array and it's frequency is " + f[s-1]);
		}
		
	}

}
