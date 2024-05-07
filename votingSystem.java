package Assignment;

import java.util.Scanner;

public class votingSystem {
	
	int num[4];
	
		public static void main (String args[])
		{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		sc.nextLine(); 
		System.out.print("Enter your gender");
		String gender = sc.nextLine();
		if (age >= 18 && gender.equals("female")) {
		System.out.println("You are eligible to vote.");
		} 
		else 
		{
		 System.out.println("You are not eligible to vote.");
		}
		 sc.close();
		
		}
		}