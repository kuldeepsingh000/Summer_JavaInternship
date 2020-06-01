package arrayBasics19Q;

//3.WAP to accept an Array to accept a Month number and Display the numbr of days that months has.(

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number : ");
		int n =sc.nextInt();
		
		int [] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if(n<1 || n>12){
			System.out.println("Enter valid month number");
		}else {
			System.out.println(months[n-1]);
		}
	}

}
