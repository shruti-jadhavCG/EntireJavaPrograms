package FinalAssignmet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetProgram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("lets understand about list");
		List a1 = new ArrayList();
		a1.add("pen");
		a1.add("pencil");
		a1.add("box");
		a1.add("bottle");
		System.out.println(a1);
//		list follow indexing
//		order of insertion - true
		a1.add("pen");
		System.out.println(a1);
//		list allowed duplicate values
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
//		list allow multiple null
		
		System.out.println("lets understand about set");
		Set a2 = new HashSet();
		a2.add("pen");
		a2.add("pencil");
		a2.add("box");
		a2.add("bottle");
		System.out.println(a2);
//		dont follow indexing
//		order of insertion - false
		a2.add("pen");
		System.out.println(a2);
//		set does not allow duplicate values
		a2.add(null);
		a2.add(null);
		System.out.println(a2);
//		set accept only one null
		
		
	}

}
