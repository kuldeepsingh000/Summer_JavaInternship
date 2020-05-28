package javaStringsLevel1;

//14.	WAP to replace “15 august” with “26 january” and  “independence” with 
//“republic” in the string “15 august is independence day” 

public class Q14 {

	public static void main(String[] args) {
		String s = "15 august is independence day";
		
		String s1 = s.replace("15", "26");
		String s2 = s1.replace("august", "january");
		s2 = s2.replace("independence", "republic");
		System.out.println(s2);
	}

}
