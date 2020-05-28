package javaStringsLevel1;

import java.util.Scanner;

//3.	WAP to accept a String and Count number of Capital letters present in it.(eq- ComPuter - 2)

public class Q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s  = sc.nextLine();
		
		int n = s.length();
		
		int c = 0;
		
		for(int i = 0 ; i <n ; i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				c++;
			}
		}
		
		System.out.println(c);
		
		sc.close();
		
	}

}
