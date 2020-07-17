package chapter6.command.p4_remote_control_party;

public class TVOffCommand implements Command {
	
	TV tv;
	
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
	}

}
