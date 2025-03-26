package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set <String> s = new HashSet<String>();
		s.add("Red");
		s.add("Black");
		s.add("White");
		s.add("Blue");
		s.add("Yellow");
		System.out.println(s);
		Set <String> s1 = new HashSet <String>();
		s1.add("Orange");
		s1.add("Pink");
		s1.add("Green");
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s.contains("Yellow"));
		System.out.println(s1.containsAll(s));
		System.out.println(s.isEmpty());
		s.removeAll(s1);
		System.out.println(s);
		System.out.println(s.size());
		s1.clear();
		System.out.println(s1);

	}

}
