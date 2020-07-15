package chapter6.commandpattern.p3_remote_control_undo;

public class GarageDoorDownCommand implements Command {

	GarageDroor garageDoor;
	
	public GarageDoorDownCommand(GarageDroor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.down();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
