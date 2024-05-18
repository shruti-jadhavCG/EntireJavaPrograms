package FinalAssignmet;

import java.util.Scanner;

public class Assignment12
{
//	"Declare and utilize all methods of Scanner class with the help of static method"

	public static void main(String[] args) 
	{
       Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("You entered: " + str);

        System.out.print("Enter an integer: ");
        int integer = sc.nextInt();
        System.out.println("You entered: " + integer);

        System.out.print("Enter a float: ");
        float floatNumber = sc.nextFloat();
        System.out.println("You entered: " + floatNumber);

        System.out.print("Enter a double: ");
        double doubleNumber = sc.nextDouble();
        System.out.println("You entered: " + doubleNumber);

        System.out.print("Enter a boolean (true/false): ");
        boolean bool = sc.nextBoolean();
        System.out.println("You entered: " + bool);
        sc.nextLine();

        System.out.print("Enter a line of text: ");
        String line = sc.nextLine();
        System.out.println("You entered: " + line);

        sc.close();

	}

}
