package array;

public class matchesFunction 
{
	// create a array of size of 4 and avrage values of array
	static double avg = 0;
	static int sum = 0;
	static int reminder = 0;

	public static void main(String args[])
	{
		int num[] = new int[4];
		num[0] = 14;
		num[1] = 16;
		num[2] = 13;
		num[3] = 45;
		
		for(int i = 0; i<num.length; i++)
		{
			sum = sum+num[i];
			avg = sum/num.length;
			reminder sum%(num.length);
		}
		System.out.println(sum);
		System.out.println("avg= "+avg);
	}
	
//	create two array one of int data type and 1 double data type both of size 4, calculate the avg of all eight values
}
