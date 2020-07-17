package chapter9.iterator.p1_dinermerger;

import java.util.List;

public class PancakeHouseIterator implements Iterator {
	List<MenuItem> items;
	int index;
	
	public PancakeHouseIterator(List<MenuItem> items) {
		this.items = items;
		index = 0;
	}

	@Override
	public boolean hasNext() {
		if(index >= items.size()) {
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = items.get(index);
		index++;
		return menuItem;
	}

}
