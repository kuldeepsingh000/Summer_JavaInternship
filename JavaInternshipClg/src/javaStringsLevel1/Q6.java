package javaStringsLevel1;

import java.util.Scanner;

//Comparison of two string

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		if(s1.compareTo(s2) > 0) {
			System.out.println("0");
		}
		
		else if(s1.compareTo(s2) < 0) {
			System.out.println("-1");
		}
		
		else {
			System.out.println("0");
		}
			
		sc.close();
	}

}
