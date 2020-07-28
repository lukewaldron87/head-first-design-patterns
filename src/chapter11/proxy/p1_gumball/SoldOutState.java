package chapter11.proxy.p1_gumball;

public class SoldOutState implements State {

    private static final long serialVersionUID = 2L;
    transient private GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("No gumballs to dispense");
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

    @Override
    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
}
