package javaStringsLevel1;

import java.util.Scanner;

//22.WAP to accept a sentence and display the words having double sequences.
//(eq- I Like Rabbit---- rabbit)

public class Q22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String w="";
        char ch;
        int w1,j;
        String str = sc.nextLine();
        str = str + " ";
        
        for(int i =0 ; i< str.length();i++)
        {
            ch = str.charAt(i);
            if(ch!= ' ') 
            {
              w = w + ch;  
            }
            else
            {
                 w1 = w.length();
                for( j =0 ; j<w1-1;j++)
                {
                    if(w.charAt(j) == w.charAt(j+1))
                    {
                        break;
                        
                    }
                }
                    if(j<w1-1)
                    {
                        System.out.println(w);
                    }
                    w = "";
                }
            
        }

	}

}
