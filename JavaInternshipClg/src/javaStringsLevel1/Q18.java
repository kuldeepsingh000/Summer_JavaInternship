package javaStringsLevel1;

import java.util.Arrays;
import java.util.Scanner;

//18.	WAP to accept a String count the frequency of each alphabet in the String.
//banana
//b	1
//a	3
//n	2

public class Q18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int n = s.length();

		char arr[] = s.toCharArray();
		boolean visited[] = new boolean[n];

		Arrays.fill(visited, false);

		for (int i = 0; i < n; i++) {
			if (visited[i] == true)
				continue;
			
			else {
				int count = 1;
				for (int j = i + 1; j < n; j++) {
					if (arr[i] == arr[j]) {
						visited[j] = true;
						count++;
					}
				}
				System.out.println(arr[i] + " " + count);
			}
		}

		sc.close();
	}

}
