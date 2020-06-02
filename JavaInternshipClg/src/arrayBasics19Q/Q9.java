package arrayBasics19Q;

import java.util.Scanner;

//9.WAP to assign 10 numbers in an array and Sort it is ascending  order using Bubble sort 

public class Q9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		for(int i = 0 ;i<n; i++)
		{
			for(int j = 0; j<n-i-1 ;j ++)
			{
				if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
			}
			
		}
		
		for(int e : arr)
		{
			System.out.print(e + " ");
		}
	}

}
