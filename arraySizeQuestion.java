package array;

public class arraySizeQuestion {

//	//	create two array one of int data type and 1 double data type both of size 4, calculate the avg of all eight values

	static double avg = 0;
	static double avg1 = 0;
	static int sum = 0;
	static double sum1 = 0;
	static int reminder = 0;
	public static void main(String[] args) 
	{
		int numInt[] = new int[4];
		numInt[0]= 14;
		numInt[1]= 15;
		numInt[2]= 16;
		numInt[3]= 100;
		
		double numDouble[] = new double[4];
		numDouble[0]= 14.86;
		numDouble[1]= 12.03;
		numDouble[2]= 8.2;
		numDouble[3]= 15.3;
		
		for(int i=0; i<numInt.length; i++)
		{
			sum = sum+numInt[i];
			avg= sum/numInt.length;
		}
		System.out.println("int sum"+sum);
		System.out.println("int avg"+avg);
		for(int j=0; j<numDouble.length; j++)
		{
			sum1 = sum1+numDouble[j];
			avg1= sum1/numDouble.length;
		}
		System.out.println("double sum"+sum1);
		System.out.println("double avg"+avg1);
		
		double avg2 = avg+avg1;
		System.out.println("avg of int and double array"+avg2);
	}

}

//how to check if string contains only digits