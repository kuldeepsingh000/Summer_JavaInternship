package javaStringsLevel1;

/*
 * 13.	WAP to accept two strings and tell which comes later in lexicographics order(dictionary order). 
 * If equal how appropriate message.*/

public class Q13 {

	public static void main(String[] args) {
		
		String s  = "kuldeep";
		String s1 = "amar";
			
		if(s.compareTo(s1) < 0)
		{
			System.out.println(s + " comes before then " + s1);
		}else {
			System.out.println(s + " comes after then " + s1);
		}
		
	}

}
