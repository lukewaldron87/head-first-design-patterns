package chapter6.command.p4_remote_control_party;

public class CeilingFanOffCommand implements Command {

	private CeilingFan ceilingFan;
	private int previousSpeed;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		previousSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

	@Override
	public void undo() {

		if(previousSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}else if(previousSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		}else if(previousSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		}else if(previousSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		}
	}

}
