package FinalAssignmet;

//Program to demonstrate INTERFACE

interface Vehicle {
    void start();   
    void stop();    
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

public class Assignment32 
{
	 public static void main(String[] args)
	 {
	   Car car = new Car();
        car.start();
        car.stop();
	    }

}
