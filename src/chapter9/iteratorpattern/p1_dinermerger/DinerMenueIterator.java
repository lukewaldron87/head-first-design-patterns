package chapter9.iteratorpattern.p1_dinermerger;

public class DinerMenueIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
	
	public DinerMenueIterator(MenuItem[] items) {
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}

}
