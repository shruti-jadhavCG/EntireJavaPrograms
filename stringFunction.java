package demo1;

public class stringFunction 
{

	public static void main(String[] args) 
	{
		String name = "school";
		String  firstName = "shruti";
		String lastName = "Jadhav";
		
		String name1 = "Shruti Shinde";
		
		System.out.println("length of string "+ name.length());
		System.out.println("char at mentioned position is" + name.charAt(2));
		System.out.println("indec of letter C "+ name.indexOf('c'));
		System.out.println("convert string to uppercase " + name.toUpperCase());
		System.out.println("convert string to lowercase "+name.toLowerCase());
		System.out.println("concat "+name.concat("name is ABC public school"));
		System.out.println("concat string :"+firstName+ " "+lastName);
		System.out.println("contains: "+name.contains("sch"));
		
		System.out.println("Name1 contains " +name1.contains("Shinde"));
		
	}

}
