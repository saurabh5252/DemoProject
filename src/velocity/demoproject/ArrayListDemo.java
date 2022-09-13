package velocity.demoproject;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Saurabh");
		list.add("Suyash");
		list.add("Sakshi");
		list.add("Sagar");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
			
		
	}

}
