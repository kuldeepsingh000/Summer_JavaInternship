package arrayBasics19Q;

import java.util.*;

//18.	WAP to accept 10 integers in an array and display the frequency of each Distinct element.
//(Ex   - 5,5,6,7,7,8,9,1)

public class Q18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		boolean[] visited = new boolean[n];
		Arrays.fill(visited, false);

		for (int i = 0; i < n; i++) {
			if (visited[i] == true) {
				continue;
			}

			int count = 1;

			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					visited[j] = true;
					count++;
				}
			}

			System.out.println(arr[i] + " " + count);
		}

		sc.close();
	}

}
