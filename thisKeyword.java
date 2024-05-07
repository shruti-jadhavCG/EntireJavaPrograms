package demo1;

public class thisKeyword 
{
	thisKeyword()
	{
	
		System.out.println("1");
	}
	
	thisKeyword(int a)
	{
		this('a');
		System.out.println("2");
	}
	thisKeyword(char b)
	{
		this();
		System.out.println("3");
	}
	
	public static void main(String args[]) {
		thisKeyword t = new thisKeyword('a');
	}

}
