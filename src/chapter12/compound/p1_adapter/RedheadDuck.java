package chapter12.compound.p1_adapter;

public class RedheadDuck implements Quackable{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
