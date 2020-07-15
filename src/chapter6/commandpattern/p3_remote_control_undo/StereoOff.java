package chapter6.commandpattern.p3_remote_control_undo;

public class StereoOff implements Command {

	Stereo stereo;
	
	public StereoOff(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		this.stereo.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
