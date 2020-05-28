package javaStringsLevel1;

import java.util.Scanner;

/*2.	WAP to accept the First name , Middle Name and Last Name of a person and display full name 
and Short Name (eq- Amar Kumar Singh-   A.K.S)*/


public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String FirstName  = sc.next();
		String SecondName = sc.next();
		String LastName   = sc.next();
		
		System.out.println(FirstName + " " + SecondName + " " + LastName);
		
		char x = FirstName.charAt(0);
		char y = SecondName.charAt(0);
		char z = LastName.charAt(0);
		
		System.out.println(x + "." + y + "." + z);
		
		sc.close();

	}

}
