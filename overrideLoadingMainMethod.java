package overrideMethods;

//  can we override main method = ans is "yes"
public class overrideLoadingMainMethod {

	public static void main(String[] args) 
	{
		System.out.println("1");
		main();
		main(12);
		main("shruti");
	}
	public static void main()
	{
		System.out.println("2");
		main("shruti");
	}
	public static void main(int a)
	{
		System.out.println("3");
	}
	public static void main(String b)
	{
		System.out.println("4");
	}

}
