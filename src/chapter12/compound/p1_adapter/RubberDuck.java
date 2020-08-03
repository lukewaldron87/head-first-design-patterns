package chapter12.compound.p1_adapter;

public class RubberDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
