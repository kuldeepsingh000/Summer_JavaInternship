package arrayBasics19Q;

import java.util.*;

//14. WAP to accept N integers from user and find the Second largest/Second Smallest element.

public class Q14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		
		Arrays.sort(array);
		
		System.out.println("Second largest : " + array[n-2] + " & " + "Second smallest : " + array[1]);

	}

}
