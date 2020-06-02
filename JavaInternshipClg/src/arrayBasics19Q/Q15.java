package arrayBasics19Q;

import java.util.Scanner;

//15.	WAP to find the Prime numbers present in a predefined integer array.

public class Q15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] array = new int[n];

		for (int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		
		
		for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            if (array[i] == 1)
                isPrime = false;
            else {
                for (int j = 2; j <= array[i] / 2; j++) {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime)
                System.out.println(array[i] + " is a prime number in the array ");
        }
		
			
		sc.close();
	}

}
