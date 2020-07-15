package chapter6.commandpattern.p3_remote_control_undo;

public interface Command {
	public void execute();
	public void undo();
}
