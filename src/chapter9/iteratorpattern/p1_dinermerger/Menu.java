package chapter9.iteratorpattern.p1_dinermerger;

import chapter9.iteratorpattern.p2_java_iterator.p1_dinermerger.MenuItem;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
