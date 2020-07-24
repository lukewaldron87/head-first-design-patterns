package chapter10.state.p3_gumball_state_winner;

public class SoldOutState implements State {

    private GumballMachine gumballMachine;

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
