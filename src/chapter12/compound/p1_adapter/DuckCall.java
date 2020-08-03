package chapter12.compound.p1_adapter;

public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak");
    }
}
