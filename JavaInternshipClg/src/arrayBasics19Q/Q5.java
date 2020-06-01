package arrayBasics19Q;

import java.util.Scanner;

//5.	WAP to assign some values in two arrays an merge them into third array. 

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a1 = new int[n];
		int m = sc.nextInt();
		int [] a2 = new int[m];
		
		for(int i=0; i<n; i++) a1[i] = sc.nextInt();
		for(int i=0; i<m; i++) a2[i] = sc.nextInt();
		
		int [] a3 = new int[n+m];
		
		int i=0;
		for(i=0; i<n; i++) a3[i] = a1[i];
		for(int j=0; j<m; j++) a3[j+i] = a2[j];
		
		for(int e : a3)
		{
			System.out.print(e + " ");
		}

	}

}
