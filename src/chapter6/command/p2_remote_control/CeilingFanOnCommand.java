package chapter6.command.p2_remote_control;

public class CeilingFanOnCommand implements Command {

	CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		ceilingFan.high();
	}

}
