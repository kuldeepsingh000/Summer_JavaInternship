package javaStringsLevel1;

import java.util.Scanner;

//8. WAP to accept a String and Convert the case of each alphabet present in it.(JaVa --- jAvA)

public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		char[] str = s.toCharArray();
		int n = str.length;
		
		for (int i = 0; i < n; i++) {
			
			if (str[i] >= 'a' && str[i] <= 'z')
				str[i] -= 32;
			
			else if (str[i] >= 'A' && str[i] <= 'Z')
				str[i] += 32;
			
		}

		System.out.println(str);
		sc.close();

	}

}