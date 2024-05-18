package FinalAssignmet;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_ListIterator {

	public static void main(String[] args)
	{
		System.out.println("lets understand about list");
		List a1 = new ArrayList();
		a1.add("pen");
		a1.add("pencil");
		a1.add("box");
		a1.add("bottle");
		System.out.println(a1);
		ListIterator i2 = a1.listIterator();
		while(i2.hasNext()) {
			System.out.println("forward");
			System.out.println(i2.next());
		}
		System.out.println("---------------------------------------------");
		while(i2.hasPrevious())
		{
			System.out.println("backword");
			System.out.println(i2.previous());
		}
				
	}

}
