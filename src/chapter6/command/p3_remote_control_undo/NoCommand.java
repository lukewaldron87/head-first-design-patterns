package chapter6.command.p3_remote_control_undo;

public class NoCommand implements Command {
	public void execute() { }

	@Override
	public void undo() { }
}
