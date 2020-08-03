package chapter12.compound.p3_factory;

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

    public static int getQuacks(){
        return quackCounter;
    }

    public String toString(){
        return duck.toString();
    }
}
