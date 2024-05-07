package array;

import java.util.Scanner;

public class arrayAtRuntime {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int rollno[] = new int[3];
		System.out.println("enter roll no");
		rollno[0] = sc.nextInt();
		rollno[1] = sc.nextInt();
		rollno[2] = sc.nextInt();
		System.out.println("==============for loop===========");
		for(int i=0; i<3;i++)
		{
			System.out.println("enter roll no"+i);
			rollno[i] = sc.nextInt();
			System.out.println("roll No"+rollno[i]);
		}
	}

}
