package chapter6.commandpattern.p1_simple_remote_control;

public class RmoteContorlTest {

	public static void main(String[] args) {

		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		GarageDroor garageDroor = new GarageDroor();
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDroor);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
		
	}

}
