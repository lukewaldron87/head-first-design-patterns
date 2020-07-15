package chapter6.commandpattern.p2_remote_control;

public class CeilingFanOffCommand implements Command {

	private CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		ceilingFan.off();
	}

}
