package array;

public class studentNames {

	public static void main(String[] args)
	{
		
		String name[] = new String[3];
		//declare and initialise your array
		name[0] = "Jyothi";
		name[1] = "nitin";
		name[2] = "saima";
		
		int roll[] = new int[3];
		roll[0]=77;
		roll[1]=78;
		roll[2]=789;
		
		char gender[] = new char[3];
		gender[0]='F';
		gender[1]='M';
		gender[2]='M';
		
		System.out.println("studet name: "+"rollno:"+"gender: ");

		for(int i = 0; i<=2; i++)
		{
		System.out.println(name[i]+" "+roll[i]+" "+gender[i]);
		}

	}

}
