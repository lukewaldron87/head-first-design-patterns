package chapter6.command.p4_remote_control_party;

public class HottubOnCommand implements Command {
	
	Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	@Override
	public void execute() {
		hottub.on();
	}

	@Override
	public void undo() {
		hottub.off();
	}

}
