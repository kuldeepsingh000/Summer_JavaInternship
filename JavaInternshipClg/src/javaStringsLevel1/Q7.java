package javaStringsLevel1;

import java.util.Scanner;

/*7.	WAP to accept a day name and display the Day number.(eq- Monday --1) */

public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
			
		switch (s) {
			case "Monday" :
				System.out.println(s + " -- " + 1);
				break;
			case "Tuesday":
				System.out.println(s + " -- " + 2);
				break;
			case "Wednesday":
				System.out.println(s + " -- " + 3);
				break;
			case "Thursday":
				System.out.println(s + " -- " + 4);
				break;
			case "Friday":
				System.out.println(s + " -- " + 5);
				break;
			case "Satureday":
				System.out.println(s + " -- " + 6);
				break;
			case "Sunday":
				System.out.println(s + " -- " + 7);
				break;
	
			default:
				System.out.println("invalid input\n");
				break;
		}
		
		sc.close();

	}

}
