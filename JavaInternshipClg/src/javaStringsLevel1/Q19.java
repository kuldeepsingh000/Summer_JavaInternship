package javaStringsLevel1;

import java.util.Scanner;

//19.	WAP to accept a String and Display it in Title Case.
//(eq- My name is covid----- My Name Is Covid)

public class Q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str, r = "";
		char ch;
		str = sc.nextLine();
		str = " " + str;
		int n = str.length();
		for (int i = 0; i < n; i++) {
			ch = str.charAt(i);
			if (ch == ' ') {
				r = r + ch;
				i++;
				ch = Character.toUpperCase(str.charAt(i));
			} else
				ch = Character.toLowerCase(str.charAt(i));
			r = r + ch;
		}
		System.out.println(r.substring(1));

	}

}
