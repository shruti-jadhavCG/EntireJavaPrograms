package FinalAssignmet;

import java.util.Scanner;

public class Assignment11
{
//	Arithmetic Operation using Human input
	Scanner sc = new Scanner(System.in);
	
	int a = sc.nextInt();

	int b = sc.nextInt();

	public void addition()
	{
		int c = a+b;
		System.out.println("addition is "+c);
	}
	
	public void substraction()
	{
		int c = b-a;
		System.out.println("substraction is "+c);
	}
	public void multiplication()
	{
		int c = b*a;
		System.out.println("multiplication is "+c);
	}
	public void mod()
	{
		int c = b%a;
		System.out.println("modulus is "+c);
	}
	public void division()
	{
		int c = b/a;
		System.out.println("division is "+c);
	}
	public static void main(String[] args) 
	{
		Assignment11 v =new Assignment11();
		
		
		

		v.addition();
		v.substraction();
		v.multiplication();
		v.mod();
		v.division();

	}


}
