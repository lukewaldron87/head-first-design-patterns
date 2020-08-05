package chapter12.compound.p5_observer;

import java.util.ArrayList;
import java.util.Iterator;

public class Observable implements QuackObservable{
    private ArrayList<Observer> observerList = new ArrayList<Observer>();
    private QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update(duck);
        }
    }

    public Iterator<Observer> getObservers(){
        return observerList.iterator();
    }
}
