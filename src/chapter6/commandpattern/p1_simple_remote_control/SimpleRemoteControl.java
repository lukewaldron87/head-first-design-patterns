package chapter6.commandpattern.p1_simple_remote_control;

public class SimpleRemoteControl {
	
	Command slot;
	
	public SimpleRemoteControl() {
		
	}
	
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}

}
