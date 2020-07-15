package chapter6.commandpattern.p2_remote_control;

public class GarageDroor {
	
	private String location;
	
	public GarageDroor(String location) {
		this.location = location;
	}

	public void up() {
		System.out.println(location+ " garage door is open");
	}
	
	public void down() {
		System.out.println(location+ " garage door is closed");
	}
	
	public void stop() {
		System.out.println(location+ " garage door stoped");
	}
	
	public void lightOn() {
		System.out.println(location+ " garage light on");
	}
	
	public void lightOff() {
		System.out.println(location+ " garage light off");
	}
}
