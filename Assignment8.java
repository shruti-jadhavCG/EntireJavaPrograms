package FinalAssignmet;

public class Assignment8 {
	
//	Program to do add,sub,mul,mod using global variable
	
	public static int a=10, b=20;

	public static void addition()
	{
		int c = a+b;
		System.out.println("addition is "+c);
	}
	
	public static void substraction()
	{
		int c = b-a;
		System.out.println("substraction is "+c);
	}
	public static void multiplication()
	{
		int c = b*a;
		System.out.println("multiplication is "+c);
	}
	public static void mod()
	{
		int c = b%a;
		System.out.println("modulus is "+c);
	}
	
	public static void main(String[] args) 
	{
		addition();
		substraction();
		multiplication();
		mod();

	}

}
