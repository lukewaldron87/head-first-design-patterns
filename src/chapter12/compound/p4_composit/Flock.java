package chapter12.compound.p4_composit;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable{

    List<Quackable> quackables = new ArrayList<Quackable>();

    public void add(Quackable quackable){
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        for(Quackable quackable: quackables){
            quackable.quack();
        }
    }

    public String toString() {
        return "Flock of Quackers";
    }
}
