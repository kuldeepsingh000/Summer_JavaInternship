package arrayBasics19Q;

import java.util.Arrays;
import java.util.Scanner;

//13.	WAP to accept N inetegers from user and find the Largest/Smallest element in an array.

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		
		Arrays.sort(array);
		
		System.out.println("largest : " + array[n-1] + " & " + "smallest : " + array[0]);


	}

}
