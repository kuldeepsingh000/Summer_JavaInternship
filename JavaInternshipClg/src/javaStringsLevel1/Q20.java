package javaStringsLevel1;

import java.util.Scanner;

//20.	WAP to accept a sentence and display the words having length is greater than 5

public class Q20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		s = s + " ";
		String st = "";

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				st = st + s.charAt(i);
			else {
				if (st.length() >= 5)
					System.out.print(st + " ");
				st = "";
			}
		}
	}

}
