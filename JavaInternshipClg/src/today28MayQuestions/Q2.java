package today28MayQuestions;

import java.util.Scanner;

//Algorithms to reverse the string by taking from user

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int n = s.length();
		
		String str = "";
		
		for(int i=n-1; i>=0; i--)
		{
			str += s.charAt(i);
		}
		
		System.out.println(str);
		
	}

}
