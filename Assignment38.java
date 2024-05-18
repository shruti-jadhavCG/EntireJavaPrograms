package FinalAssignmet;

//Demonstrate MULTILEVEL INHERITANCE
class GrandParent1 {
	void grandParentMethod() {
		System.out.println("This is the grandparent method");
	}
}
class parentclass extends GrandParent1 {
	void parentMethod() {
		System.out.println("This is the parent method");
	}
}

class childclass extends parentclass {
	void childMethod() {
		System.out.println("This is the child method");
	}
}

public class Assignment38 {
	public static void main(String[] args) 
	{
		childclass obj = new childclass();
		obj.grandParentMethod();
		obj.parentMethod();
		obj.childMethod();
	}

}
