package chapter12.compound.p5_observer;

public class GooseFactory extends AbstractGooseFactory {

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
