package chapter6.command.p3_remote_control_undo;

public class RemoteLoader {
	
	public static void main(String[] args) {
		
		RemoteControlWithUndo remoteConrol = new RemoteControlWithUndo();
		
		// Create all the devices in their proper locations
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		// Create the On and Off for the ceiling fan
		CeilingFanMediumCommand ceilingFanMediumCommand = new  CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHighCommand = new  CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new  CeilingFanOffCommand(ceilingFan);
		
		remoteConrol.setCommand(0, ceilingFanMediumCommand, ceilingFanOff);
		remoteConrol.setCommand(1, ceilingFanHighCommand, ceilingFanOff);
		
		remoteConrol.onButtonWasPressed(0);
		remoteConrol.offButtonWasPressed(0);
		System.out.println(remoteConrol);
		remoteConrol.undoButtonWasPushed();
		
		remoteConrol.onButtonWasPressed(1);
		System.out.println(remoteConrol);
		remoteConrol.undoButtonWasPushed();
	}

}
