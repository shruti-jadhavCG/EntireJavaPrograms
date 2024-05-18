package FinalAssignmet;

import java.util.Scanner;

public class assignemnt6 {

//	Else if program to print ticket cost based on a value passed
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		if (age == 0)
		{
			System.out.println("Invalid");
		}
		else if (age <=5)
		{
			System.out.println("cost is "+ 50);
		}
		else if(age<=18)
		{
			System.out.println("cost is "+100);
		}
		else 
		{
			System.out.println("cost is "+70);
		}

	}

}
