package chapter6.commandpattern.p4_remote_control_party;

public class HottubOffCommand implements Command {
	
	Hottub hottub;
	
	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.off();
	}

	@Override
	public void undo() {
		hottub.on();
	}

}
