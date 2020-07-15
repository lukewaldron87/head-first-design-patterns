package chapter6.commandpattern.p3_remote_control_undo;

public class Stereo {
	
	private String location;
	
	public Stereo(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " stereo on");
	}
	
	public void off() {
		System.out.println(location + " stereo off");
	}

	public void setCd() {
		System.out.println("Setting " + location + " stereo to CD");
	}
	
	public void setDvd() {
		System.out.println("Setting " + location + " stereo to Dvd");
	}
	
	public void setRadio() {
		System.out.println("Setting " + location + " stereo to Radio");
	}

	public void setVolume(int level) {
		System.out.println("Setting " + location + " stereo volume to "+level);
	}

}
