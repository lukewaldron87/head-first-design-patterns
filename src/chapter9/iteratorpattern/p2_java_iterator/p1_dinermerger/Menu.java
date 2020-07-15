package chapter9.iteratorpattern.p2_java_iterator.p1_dinermerger;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
