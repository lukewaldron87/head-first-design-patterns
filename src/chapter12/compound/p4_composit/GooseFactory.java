package chapter12.compound.p4_composit;

public class GooseFactory extends AbstractGooseFactory {

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
