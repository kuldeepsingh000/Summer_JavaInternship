package arrayBasics19Q;

import java.util.Scanner;

//10.	WAP to assign 10 numbers in an array and Sort it is ascending  order using Selection  sort 

public class Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
		
		for(int e : arr)
		{
			System.out.print(e + " ");
		}
	}

}
