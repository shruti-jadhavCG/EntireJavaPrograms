package FinalAssignmet;

import java.util.Scanner;

public class Assignment10 {

//	Find the area and circumference of the circle using final variable concept
	private static final double pi = 3.14;

    public static void main(String[] args) {
        double radius = 5.0;

        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
		
	}

}
