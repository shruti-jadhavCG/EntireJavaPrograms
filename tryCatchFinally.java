package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tryCatchFinally {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try {
			int age = sc.nextInt();
			System.out.println(age);
		}
		catch (InputMismatchException e) 
		{
			
		}
		finally
		{
			System.out.println("thank you for visiting us, come again");
		}
	}

}
