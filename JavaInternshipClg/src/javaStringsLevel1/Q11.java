package javaStringsLevel1;

import java.util.Scanner;

//11.	WAP to accept a word and convert it to pigLatin form(trouble --- oubletray)

public class Q11 {
	
	static boolean isVowel(char c) {
		return (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'); 
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		int len = s1.length();
		
		int index = -1;
		
		for(int i = 0 ; i<len; i++)
		{
			if(isVowel(s1.charAt(i))) {
				index = i;
				break;
			}
			
		}
		
		if(index == -1) System.out.println("Piglatin not possible");
//		System.out.println(s1.substring(index));
		else System.out.println(s1.substring(index) + s1.substring(0, index) + "ay");
		
	}

}
