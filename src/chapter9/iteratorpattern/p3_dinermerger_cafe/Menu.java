package chapter9.iteratorpattern.p3_dinermerger_cafe;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
