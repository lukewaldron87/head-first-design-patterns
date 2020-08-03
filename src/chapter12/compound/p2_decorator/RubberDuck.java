package chapter12.compound.p2_decorator;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
