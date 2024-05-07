package FinalAssignmet;

public class assignemnt3 {

//	"Nonstatic method Program for add,sub,mul,div,mod"
	static int a=10;
	static int b= 5;
	static int c;
	
	public void addition()
	{
		c=a+b;
		System.out.println("addition "+c);
	}
	public void substraction()
	{
		c=a-b;
		System.out.println("substraction "+c);
	}
	public void multiplication()
	{
		c=a*b;
		System.out.println("multiplication "+c);
	}
	public void division()
	{
		c=a/b;
		System.out.println("division "+c);
	}
	public static void main(String[] args) 
	{
		assignemnt3 as = new assignemnt3();
		as.addition();
		as.substraction();
		as.multiplication();
		as.division();

	}

}
