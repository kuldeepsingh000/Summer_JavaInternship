package arrayBasics19Q;

import java.util.Scanner;

//2.	WAP to accept an Array input from an User. and find the Average of Numbers of each array.

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		int arr[] = new int[n];
		
		int avg = 0;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			avg += arr[i];
		}
		System.out.println("The average is : " + avg/n);
	}

}
