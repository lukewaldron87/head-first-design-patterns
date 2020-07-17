package chapter6.command.p2_remote_control;

public class GarageDoorUpCommand implements Command {

	GarageDroor garageDoor;
	
	public GarageDoorUpCommand(GarageDroor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.up();

	}

}
