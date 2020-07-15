package chapter6.commandpattern.p3_remote_control_undo;

public class CeilingFanHighCommand implements Command {

	private CeilingFan ceilingFan;
	private int previousSpeed;
	
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		previousSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
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
