package chapter6.command.p3_remote_control_undo;

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
