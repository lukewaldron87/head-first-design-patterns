package chapter10.state.p2_gumball_state;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("not gumballs to dispense");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("Sold out");

    }

    @Override
    public void dispense() {
        System.out.println("Sold out");

    }
}
