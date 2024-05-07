package Assignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandlingProg {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter array size");
			int n1 = sc.nextInt();
			
			String name[] = new String[n1];
			System.out.println("Enter "+n1+" names:");
			for(int i=0; i<n1;i++)
			{
				System.out.println("enter name: "+n1);
				name[i]=sc.next();
			}
			
		}
		catch(InputMismatchException e )
		{
			System.out.println("please enter number only");
		}
		
		
		
	}

}
