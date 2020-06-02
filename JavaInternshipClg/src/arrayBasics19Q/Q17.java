package arrayBasics19Q;

import java.util.*;

//17.WAP to assign 10 integers in an array and extract the even element into another array.

public class Q17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // By default make it as 10.
		
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++) arr[i] = sc.nextInt();
		
		List<Integer> l = new ArrayList();
		
		for(int i=0; i<n; i++)
		{
			if(arr[i]%2 == 0)
			{
				l.add(arr[i]);
			}
		}
		
		System.out.println(l);
	}

}
