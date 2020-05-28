package today28MayQuestions;

import java.util.Scanner;

//Replace all the vowels with z;

public class Q3 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the string");
	   
	    String s = sc.nextLine();
	    System.out.println(s.replaceAll("[AaEeIiOoUu]", "z"));
		
//		char[] ch = s.toCharArray();
//		n = str.length();
//		for(int i=0; i<n; i++)
//		{
//			 if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
//             {
//              ch[i]='z'; 
//             }   
//		}
		
//		System.out.println(ch);
		
	    sc.close();

	}

}
