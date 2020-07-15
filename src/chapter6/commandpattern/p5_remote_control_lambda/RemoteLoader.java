package chapter6.commandpattern.p5_remote_control_lambda;

import javax.swing.event.CellEditorListener;

public class RemoteLoader {
	
	public static void main(String[] args) {
		
		RemoteControl remoteConrol = new RemoteControl();
		
		// Create all the devices in their proper locations
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDroor garageDoor = new GarageDroor("");
		Stereo stereo = new Stereo("Living Room");
		
		remoteConrol.setCommand(0, livingRoomLight::on, livingRoomLight::off);
		remoteConrol.setCommand(1, kitchenLight::on, kitchenLight::off);
		remoteConrol.setCommand(2, ceilingFan::high, ceilingFan::off);
		
		Command stereoOnWithCd = () -> {
			stereo.on(); stereo.setCd(); stereo.setVolume(11);
		};
		remoteConrol.setCommand(3, stereoOnWithCd, stereo::off);
		remoteConrol.setCommand(4, garageDoor::up, garageDoor::down);
		
		System.out.println(remoteConrol);
		
		remoteConrol.onButtonWasPressed(0);
		remoteConrol.offButtonWasPressed(0);
		remoteConrol.onButtonWasPressed(1);
		remoteConrol.offButtonWasPressed(1);
		remoteConrol.onButtonWasPressed(2);
		remoteConrol.offButtonWasPressed(2);
		remoteConrol.onButtonWasPressed(3);
		remoteConrol.offButtonWasPressed(3);
	}

}
