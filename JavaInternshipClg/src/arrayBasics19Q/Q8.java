package arrayBasics19Q;

import java.util.Scanner;

//8.	WAP to accept 10 numbers in an array and search a given number,  
//if the number exists display its position (index) else display a suitable message.(Binary Search)

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		System.out.println("Enter the elements you want to search : ");
		int s = sc.nextInt();
		
		int left = 0;
		int right = n;
		boolean ok = false;
		
		while(left < right) {
			int mid = left + (right-left) / 2;
//			System.out.println(mid);
			if(arr[mid] == s)
			{
				ok = true;
				break;
			}
			
			else if(arr[mid] < s)
			{
				left = mid + 1;
			}
			
			else {
				right = mid;
			}
		}
		
		if(ok)
		{
			System.out.println("The value is present");
		}else {
			System.out.println("The Value is not present");
		}
		
		sc.close();
		
	}

}
