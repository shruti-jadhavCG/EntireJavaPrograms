package FinalAssignmet;

import java.util.Scanner;

public class Assignment7 {

//	"Program to print 
//	1:Print 100 to 0
//	2: Print-50 to -30
//	3:Print -10 to +10
//	4:Print even and Odd using if else condition"
	public static void main(String[] args) 
	{
		
		

		System.out.println("Print 100 to 0");
		for(int i =100; i>=0; i--)
		{
			System.out.println(i+" ");
		}
		System.out.println("----------------------------------------------");
		System.out.println("Print-50 to -30");
		for(int i = -50; i<=-30; i++)
		{
			System.out.println(i+" ");
		}
		System.out.println("----------------------------------------------");
		System.out.println("Print -10 to +10");
		for(int i = -10; i<=10;i++)
		{
			System.out.println(i+" ");
		}
		System.out.println("----------------------------------------------");
		System.out.println("Print even and Odd using if else condition");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		if(num%2 == 0)
		{
			System.out.println(num+ " is Even no");
		}
		else
		{
			System.out.println(num+ " is odd no");

		}

	}

}
