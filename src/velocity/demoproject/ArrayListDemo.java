package velocity.demoproject;

import java.util.ArrayList;


public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Saurabh");
		list.add("Suyash");
		list.add("Sakshi");
		list.add("Sagar");
		
		for (String str : list) {
			
			System.out.println(str);
	
			
		}
		
	}

}
