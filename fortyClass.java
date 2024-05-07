package demo1;

public class fortyClass 
{
	int age;
	String name;
	double salary;
	void student_details(int age, String name, double salary)
	{
		System.out.println("name of student is"+name+"Age"+age+"salary"+salary);
	}

	public static void main(String[] args) {
		fortyClass f = new fortyClass();
		System.out.println(f.name);
		System.out.println(f.age);
		System.out.println(f.salary);
		f.student_details(90, "shruti", 1000.89);

	}

}
