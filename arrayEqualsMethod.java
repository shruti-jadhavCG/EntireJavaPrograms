package array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class arrayEqualsMethod {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int rollno[] = new int[3];
		for(int i =0; i<rollno.length;i++)
		{
			System.out.println("Enter size of array"+i);
			rollno[i]=sc.nextInt();
		}
		System.out.println("starting of second array");
		int rollno1[] = new int[3];
		for(int i =0; i<rollno1.length;i++)
		{
			System.out.println("Enter size of array"+i);
			rollno1[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno1));
		
		


	}

}
