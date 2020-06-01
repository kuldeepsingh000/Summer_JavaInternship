package arrayBasics19Q;

//16.	WAP to accept 10 integers in an array and display the non-repeating Array
//(eq-  1, 2 , 3, 5, 6, 7, 2, 3 , 5)--- 1,6,7

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
			
		int [] a = new int[100];
		for(int e : arr)
		{
			a[e]++;
		}
		
		for(int i = 0; i<a.length; i++)
		{
			if(a[i] == 1)
			{
				System.out.print(i + " ");
			}
		}
		
	}

}
