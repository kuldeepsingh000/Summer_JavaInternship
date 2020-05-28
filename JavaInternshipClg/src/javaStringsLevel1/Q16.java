package javaStringsLevel1;

import java.util.Scanner;

//16.	WAP in java to accept 5 String/Name and Display the names that start with a Vowel.

public class Q16 {
	
	static boolean isVowel(char c) {
		return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'); 
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] s = new String[5];
		
		for(int i=0; i<5; i++)
		{
			s[i] = sc.nextLine();
		}
		
		for(int i=0; i<5; i++)
		{
			if(isVowel(s[i].charAt(0))) {
				System.out.println(s[i]);
			}
		}
		
	}

}
