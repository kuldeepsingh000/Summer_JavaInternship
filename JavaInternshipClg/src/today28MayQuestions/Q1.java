package today28MayQuestions;

public class Q1 {
	
	static void m1()
	{
		System.out.println("No return type and no receive type");
	}
	static int m2()
	{
		return 10;
	}
	static int m3(int x)
	{
		return x*x;
	}
	static char m4(char c, String s)
	{
		System.out.println("The given string is " + s);
		return c;
	}
	
	public static void main(String[] args) {
		m1();
		System.out.println(m2());
		System.out.println(m3(3));
		System.out.println(m4('k', "kul"));
	}

}
