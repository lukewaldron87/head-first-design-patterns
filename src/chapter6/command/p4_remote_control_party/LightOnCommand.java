package chapter6.command.p4_remote_control_party;

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
