package chapter6.commandpattern.p4_remote_control_party;

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
