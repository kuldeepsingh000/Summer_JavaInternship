package arrayBasics19Q;

//1.	WAP to accept an Array input from an User. and find the Sum of Numbers of each array.

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int arr[] = new int[n];
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			sum+= arr[i];
		}
			
		System.out.println(sum);
		sc.close();
	}

}
