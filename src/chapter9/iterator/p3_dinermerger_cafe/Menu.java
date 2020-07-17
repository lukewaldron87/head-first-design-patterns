package chapter9.iterator.p3_dinermerger_cafe;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
