package chapter6.command.p2_remote_control;

public class LightOffCommand implements Command {

	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.off();
	}

}
