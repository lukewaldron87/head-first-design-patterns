package chapter7.adapter.p2_iterator_enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration<Object> {

	private Iterator iterator;
	
	public IteratorEnumeration(Iterator iterator) {
		this.iterator = iterator;
	}
	
	@Override
	public boolean hasMoreElements() {
		return iterator.hasNext();
	}

	@Override
	public Object nextElement() {
		return iterator.next();
	}

}
