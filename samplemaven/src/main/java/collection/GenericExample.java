package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

	public static void main(String[] args) {
		List <String> s= new ArrayList <String>();
		s.add("Apple");
		s.add("Orange");
		s.add("Grape");
		s.add("Pineapple");
		s.add("Pappaya");
		System.out.println(s);
		System.out.println(s.get(2));
		s.set(3, "Banana");
		System.out.println(s);
		s.add("Apple");
		System.out.println(s);
		System.out.println(s.indexOf("Apple"));
		System.out.println(s.lastIndexOf("Apple"));
		s.remove(5);
		System.out.println(s);
		System.out.println(s.contains("Banana"));
			

	}

}
