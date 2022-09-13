package velocity.demoproject;

import java.util.HashSet;

public class SetDemo {
	
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);
		set.add(400);
		
		for (Integer itr: set) {
			System.out.println(itr);
			
		}
	}

}
