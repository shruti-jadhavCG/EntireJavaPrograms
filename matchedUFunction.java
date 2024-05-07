package array;

public class matchedUFunction {

	public static void main(String[] args) 
	{
		String input = "Manish";
		System.out.println(input.matches("M(.*)"));
		System.out.println(input.matches("(.*)h"));
		
//		input is Malik check if the word contains 5 letters
		
		String ip = "malik";
		System.out.println(ip.matches("....."));
		
//		check the last index pf letter h in the given string
		
		String a= "School";
		System.out.println(a.lastIndexOf('o'));
		
//		how to repeat one string multiple time
		String name = "Aman";
		System.out.println(name.repeat(10));
	}

}
