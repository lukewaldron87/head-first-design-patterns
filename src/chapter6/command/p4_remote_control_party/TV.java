package chapter6.command.p4_remote_control_party;

public class TV {
	
	private String location;
	
	public TV(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println(location + " tv on");
	}
	
	public void off() {
		System.out.println(location + " tv off");
	}

	public void setInputChannel(int channel) {
		System.out.println("Setting " + location + " tv chanel to "+channel);
	}

	public void setVolume(int level) {
		System.out.println("Setting " + location + " tv volume to "+level);
	}

}
