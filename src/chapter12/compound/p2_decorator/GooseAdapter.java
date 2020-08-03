package chapter12.compound.p2_decorator;

public class GooseAdapter implements Quackable {

    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
           goose.honk();
    }
}
