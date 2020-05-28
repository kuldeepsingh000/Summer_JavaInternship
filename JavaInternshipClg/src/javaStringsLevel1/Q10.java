package javaStringsLevel1;

import java.util.Scanner;

//10.	WAP of SubString (AMAR SINGH--- R SINGH)

public class Q10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		
		System.out.println("Enter the n");
		int n = sc.nextInt();
		
		System.out.println(s1.substring(n, s1.length()));
			
		sc.close();
	}

}
