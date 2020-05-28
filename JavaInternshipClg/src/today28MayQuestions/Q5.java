package today28MayQuestions;

import java.util.Arrays;
import java.util.Scanner;

//Enter the string
//malayalam
//m : 2
//a : 4
//l : 2
//y : 1

public class Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the string");
	    String s = sc.next();
	    
	    int n = s.length();
	    
	    char[] arr = s.toCharArray();
	    boolean [] visited = new boolean[n];
	    
	    Arrays.fill(visited, false);
	    
	    for(int i=0; i<n; i++)
	    {
	    	if(visited[i] == true) {
	    		continue;
	    	}
	    	
	    	int count = 1;
	    	for(int j=i+1; j<n; j++)
	    	{
	    		if(arr[i] == arr[j])
	    		{
	    			visited[j] = true;
	    			count++;
	    		}
	    	}
	    	
	    	System.out.println(arr[i] + " : " + count);
	    }
	}

}
