package chapter12.compound.p3_factory;

public class GooseFactory extends AbstractGooseFactory{

    @Override
    public Quackable createGoose() {
        return new GooseAdapter(new Goose());
    }
}
