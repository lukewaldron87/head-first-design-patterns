package chapter6.command.p2_remote_control;

public class GarageDoorDownCommand implements Command {

	GarageDroor garageDoor;
	
	public GarageDoorDownCommand(GarageDroor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.down();
	}

}
