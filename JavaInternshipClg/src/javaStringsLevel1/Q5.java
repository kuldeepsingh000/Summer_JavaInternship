package javaStringsLevel1;

import java.util.Scanner;

//5.	WAP to accept a string and count number of Words Present in it.(eq- Amar  Singh-- 2)

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		int c = 0;

		for(int i = 0; i < n-1; i++) {  
            if(s.charAt(i) == ' ' && Character.isLetter(s.charAt(i+1)) && (i > 0)) {  
                c++;  
            }  
        }  
		
//      For last one.
        c++;  

		System.out.println(c);

		sc.close();
	}

}
