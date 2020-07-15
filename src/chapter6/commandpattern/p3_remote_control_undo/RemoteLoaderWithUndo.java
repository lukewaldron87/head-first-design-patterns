package chapter6.commandpattern.p3_remote_control_undo;

public class RemoteLoaderWithUndo {
	
	public static void main(String[] args) {
		
		RemoteControlWithUndo remoteConrol = new RemoteControlWithUndo();
		
		Light livingRoomLight = new Light("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		
		remoteConrol.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		
		
		remoteConrol.onButtonWasPressed(0);
		remoteConrol.offButtonWasPressed(0);
		System.out.println(remoteConrol);
		remoteConrol.undoButtonWasPushed();
		remoteConrol.offButtonWasPressed(0);
		remoteConrol.onButtonWasPressed(0);
		System.out.println(remoteConrol);
		remoteConrol.undoButtonWasPushed();
	}

}
