package javaStringsLevel1;

import java.util.Scanner;

/*9. WAP to accept  word and check if it is PalinDrome */

public class Q9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int i = 0; 
		int j = n-1;
		boolean palindrome = true;
		
		while(i < j) {
			if(s.charAt(i) != s.charAt(j)) {
				palindrome = false;
				break;
			}
			i++;
			j--;
		}
		
		if(palindrome) {
			System.out.println("Yes");
		}
		
		else {
			System.out.println("No");
		}

	}

}
