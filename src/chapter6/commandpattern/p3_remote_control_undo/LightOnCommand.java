package chapter6.commandpattern.p3_remote_control_undo;

public class LightOnCommand implements Command {
	
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
