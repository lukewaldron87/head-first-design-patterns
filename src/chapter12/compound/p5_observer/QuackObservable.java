package chapter12.compound.p5_observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
