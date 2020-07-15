package chapter7.adapterpattern.p2_iterator_enumeration;

import java.util.ArrayList;
import java.util.List;

public class IteratorEnumerationTest {

	public static void main(String[] args) {
		List<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(arraylist.iterator());
		while(iteratorEnumeration.hasMoreElements()) {
			System.out.println(iteratorEnumeration.nextElement());
		}
	}
}
