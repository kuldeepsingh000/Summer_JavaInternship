package pattern;

import java.util.Scanner;

/*	3.	WAP to print the Following Pattern
		C O M P U T E R
		O M P U T E R
		M P U T E R
		P U T E R
		T E R
		E R
		R
*/


public class Q3Computer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		
		for(int i = n; i>=1; i--)
		{
			for(int j = 0; j<i; j++)
			{
				System.out.print(s.charAt(j) + " ");
			}
			
			System.out.println();
		}

	}

}
