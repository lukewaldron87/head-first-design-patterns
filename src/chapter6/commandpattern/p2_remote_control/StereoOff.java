package chapter6.commandpattern.p2_remote_control;

public class StereoOff implements Command {

	Stereo stereo;
	
	public StereoOff(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		this.stereo.off();
	}

}
