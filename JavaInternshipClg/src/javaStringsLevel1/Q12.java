package javaStringsLevel1;

import java.util.Scanner;

//12.	WAP to accept the name of a person and guess the gender based on following Table.
//Condition	Gender
//Start with "mr."	Male
//Start with “miss”	Female
//Start with “mrs”	Married Female
//Ends with “Kumari”	Female
//Else	Cannot Determine

public class Q12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name i.e string");
		String name;
		name = sc.nextLine();
		name = name.toLowerCase();
		if (name.startsWith("mr ")) {
			System.out.println("Male");
		} else if (name.startsWith("miss  ")) {
			System.out.println("Female");
		} else if (name.startsWith("mrs")) {
			System.out.println("Married Female");
		} else if (name.endsWith("kumari ")) {
			System.out.println("Female");
		}else {
			System.out.println("Cannot Determine");
		}

	}

}
