package chapter12.compound.p5_observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {

    List<Quackable> ducks = new ArrayList<Quackable>();

    public void add(Quackable duck){
        ducks.add(duck);
    }

    @Override
    public void quack() {
        for(Quackable quackable: ducks){
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        Iterator<Quackable> iterator = ducks.iterator();
        while (iterator.hasNext()){
            Quackable duck = (Quackable)iterator.next();
            duck.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
    }

    public String toString() {
        return "Flock of Ducks";
    }
}
