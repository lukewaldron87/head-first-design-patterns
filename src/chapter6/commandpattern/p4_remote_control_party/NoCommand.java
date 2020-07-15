package chapter6.commandpattern.p4_remote_control_party;

public class NoCommand implements Command {
	public void execute() { }

	@Override
	public void undo() { }
}
