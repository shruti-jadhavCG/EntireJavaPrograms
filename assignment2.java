package FinalAssignmet;

public class assignment2 {

//	"static method Program for add,sub,mul,div,mod"
	static int a=10;
	static int b= 5;
	static int c;
	
	static void addition()
	{
		c=a+b;
		System.out.println("addition "+c);
	}
	static void substraction()
	{
		c=a-b;
		System.out.println("substraction "+c);
	}
	static void multiplication()
	{
		c=a*b;
		System.out.println("multiplication "+c);
	}
	static void division()
	{
		c=a/b;
		System.out.println("division "+c);
	}
	public static void main(String[] args) 
	{
		addition();
		substraction();
		multiplication();
		division();
		
	}
	
}
