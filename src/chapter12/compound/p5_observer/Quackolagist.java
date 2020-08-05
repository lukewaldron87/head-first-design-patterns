package chapter12.compound.p5_observer;

public class Quackolagist implements Observer{

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }
}
