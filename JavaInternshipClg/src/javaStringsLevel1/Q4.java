package javaStringsLevel1;

import java.util.Scanner;

//4.	WAP to accept a string and count number of Vowels present in it

public class Q4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		int n = s.length();
		int c = 0;
		
		for(int i = 0; i<n; i++)
		{
			if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				c++;
			}
		}
		
		System.out.println(c);
		sc.close();
		
	}

}
