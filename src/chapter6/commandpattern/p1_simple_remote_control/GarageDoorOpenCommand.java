package chapter6.commandpattern.p1_simple_remote_control;

public class GarageDoorOpenCommand implements Command {

	GarageDroor garageDoor;
	
	public GarageDoorOpenCommand(GarageDroor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.up();

	}

}
