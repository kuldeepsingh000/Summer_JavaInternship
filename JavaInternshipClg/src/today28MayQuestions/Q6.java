package today28MayQuestions;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the string");
	    String s1 = sc.next();
	    String s2 = sc.next();
	    	
	    int n=s2.length();
	    String str = "";
	    for(int i=n-1; i>=0; i--)
	    {
	    	str += s2.charAt(i);
	    }
	    
	    System.out.println(s1 + str);
	}

}
