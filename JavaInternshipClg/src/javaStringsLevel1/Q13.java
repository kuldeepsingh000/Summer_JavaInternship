package javaStringsLevel1;

import java.util.Scanner;

/*
 * 13.	WAP to accept two strings and tell which comes later in lexicographics order(dictionary order). 
 * If equal how appropriate message.*/

public class Q13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		int r;
		String name, name1;
		name = sc.nextLine();
		name1 = sc.nextLine();
		r = name.compareToIgnoreCase(name1);
		if (r == 0) {
			System.out.println("Same string");
		} else if (r > 0) {
			System.out.println(name + " Comes later");
		} else {
			System.out.println(name + " Comes before");
		}
		sc.close();
	}

}
