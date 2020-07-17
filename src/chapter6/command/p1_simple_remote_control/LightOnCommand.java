package chapter6.command.p1_simple_remote_control;

public class LightOnCommand implements Command {
	
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}

}
