package javaStringsLevel1;

import java.util.Scanner;

//21.	WAP to accept a sentence and extract the palindrome words.

public class Q21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		
	    String st = "";
	    int l = s.length();
	    for(int i = l-1;i>=0;i--)
	    {
	        st = st + s.charAt(i);
	    }
	    
	    if(st.equalsIgnoreCase(s))
	    {
	        System.out.println("Palidrone String");
	    }
	    else
	    {
	        System.out.println("Not a palindrome string");
	    }
	}

}
