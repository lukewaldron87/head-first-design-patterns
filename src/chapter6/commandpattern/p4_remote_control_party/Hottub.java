package chapter6.commandpattern.p4_remote_control_party;

public class Hottub {
	
	public Hottub() {
	}
	
	public void on() {
		System.out.println("hottub on");
	}
	
	public void off() {
		System.out.println("hottub off");
	}
	
	public void circulating() {
		System.out.println("hottub circulating");
	}
	
	public void jetsOn() {
		System.out.println("hottub jets on");
	}
	
	public void jetsOff() {
		System.out.println("hottub jets off");
	}
	
	public void setTemperature(int temperature) {
		System.out.println("hottub temperature set to " + temperature);
	}
	
	

}
