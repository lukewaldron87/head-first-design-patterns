package chapter6.commandpattern.p1_simple_remote_control;

public class GarageDroor {
	
	public GarageDroor() {
	}

	public void up() {
		System.out.println("Garage door is open");
	}
	
	public void down() {
		System.out.println("Garage door is closed");
	}
	
	public void stop() {
		System.out.println("Garage door stoped");
	}
	
	public void lightOn() {
		System.out.println("Garage light on");
	}
	
	public void lightOff() {
		System.out.println("Garage light off");
	}
}
