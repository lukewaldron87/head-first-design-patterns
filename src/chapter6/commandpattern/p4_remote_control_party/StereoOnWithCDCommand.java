package chapter6.commandpattern.p4_remote_control_party;

public class StereoOnWithCDCommand implements Command {

	Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCd();
		stereo.setVolume(11);

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
