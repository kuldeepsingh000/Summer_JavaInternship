package algorithmsForInterview;

import java.util.*;


public class Q1MedianOfArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int [] a = new int[n];
	
//		int m = sc.nextInt();
//		int [] b = new int[m];
		
//		for(int i=0; i<n; i++) a[i] = sc.nextInt();
//		for(int i=0; i<m; i++) b[i] = sc.nextInt();
		
		SortedSet<Integer> ss = new TreeSet<Integer>();
		ss.add(12);
		ss.add(1);
		ss.add(54);
		ss.add(24);
		ss.add(4);
		ss.add(34);
		System.out.println(ss);
		System.out.println(ss.first()); // 1
		System.out.println(ss.last());  // 34
		System.out.println(ss.headSet(12)); // 1 4 
		System.out.println(ss.tailSet(34)); // elements greater then 34
		System.out.println(ss.subSet(12, 34));
		System.out.println(ss.comparator());
		
		sc.close();
	}

}
