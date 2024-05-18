package FinalAssignmet;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add("ram");
		a1.add("umesh");
		a1.add(12);
		a1.add("67");
		System.out.println(a1);
		Iterator i1 = a1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
