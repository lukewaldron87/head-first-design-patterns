package chapter6.commandpattern.p3_remote_control_undo;

public class GarageDoorUpCommand implements Command {

	GarageDroor garageDoor;
	
	public GarageDoorUpCommand(GarageDroor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.up();

	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
