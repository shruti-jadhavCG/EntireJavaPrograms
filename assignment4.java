package FinalAssignmet;

public class assignment4 {

//	"Program to write both static and non-static method  in a class"
	static String name = "shruti";
	String sirname;
	
	public static void staticMethod()
	{
		System.out.println("this is the static method");
		
	}
	public void nonStaticMethod()
	{
		System.out.println("this is the non static method");
		System.out.println(name);
	}
	public static void main(String[] args) 
	{
		assignment4 as = new assignment4();
		as.nonStaticMethod();
		staticMethod();
		
		
	}

}
