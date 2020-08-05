package chapter12.compound.p5_observer;

public class QuackCounter implements Quackable {

    private Quackable duck;
    private static int quackCounter;

    public QuackCounter(Quackable quackable) {
        this.duck = quackable;
        quackCounter = 0;
    }

    @Override
    public void quack() {
        duck.quack();
        quackCounter++;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }

    public static int getQuacks(){
        return quackCounter;
    }

    public String toString(){
        return duck.toString();
    }
}
