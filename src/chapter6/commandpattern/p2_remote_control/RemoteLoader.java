package chapter6.commandpattern.p2_remote_control;

public class RemoteLoader {
	
	public static void main(String[] args) {
		
		RemoteControl remoteConrol = new RemoteControl();
		
		// Create all the devices in their proper locations
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDroor garageDoor = new GarageDroor("");
		Stereo stereo = new Stereo("Living Room");
		
		// Create all the light command objects
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		// Create the On and Off for the ceiling fan
		CeilingFanOnCommand ceilingFanOn = new  CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new  CeilingFanOffCommand(ceilingFan);
		
		// Create the Up and Down commands for the Garage
		GarageDoorUpCommand garageDoorUpCommand = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDownCommand = new GarageDoorDownCommand(garageDoor);
		
		// Create the stereo On and Off commands
		StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOff stereoOff = new StereoOff(stereo);
		
		remoteConrol.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteConrol.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteConrol.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteConrol.setCommand(3, stereoOnWithCDCommand, stereoOff);
		
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
