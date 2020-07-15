package chapter9.iteratorpattern.p4_transition;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
