package demo1;

public class stringProblemVerticalNameReverse {

	//print priya in reverse manner
	public static void main(String[] args) {

		String input= "priya";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char a1=input.charAt(i);
			System.out.println(a1);
		}

	}

}
