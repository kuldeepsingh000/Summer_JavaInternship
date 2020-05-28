package javaStringsLevel1;

import java.util.Scanner;

//17.	WAP to accept  String and Convert its individual characters to capital 
//and Small alternately.(Amar----- aMaR)

public class Q17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		StringBuffer s = new StringBuffer(sc.next());
		
		int n = s.length();
		
		for(int i=0; i<n; i++)
		{
			Character c = s.charAt(i);
			if(Character.isLowerCase(c)) {
				 s.replace(i, i+1, Character.toUpperCase(c)+""); 
			}else {
				 s.replace(i, i+1, Character.toLowerCase(c)+""); 
			}
		}
		
		System.out.println(s);
	}

}
