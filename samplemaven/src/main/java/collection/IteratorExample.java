package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

	public static void main(String[] args) {
		List <String> s = new ArrayList <String>();
		s.add("Mamatha");
		s.add("Reshmi");
		s.add("Chikku");
		s.add("Devika");
		s.add("Anju");
		s.add("Renjini");
		System.out.println(s);
		Iterator i = s.iterator();
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
			 i.remove();
		System.out.println(s);
		}
		
	}


