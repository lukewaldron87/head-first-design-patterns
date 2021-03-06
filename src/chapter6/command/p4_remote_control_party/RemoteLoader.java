package chapter6.command.p4_remote_control_party;

public class RemoteLoader {
	
	public static void main(String[] args) {
		
		RemoteControl remoteConrol = new RemoteControl();
		
		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);

		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);
		
		Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};
		
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
		
		remoteConrol.setCommand(0, partyOnMacro, partyOffMacro);
		
		System.out.println(remoteConrol);
		System.out.println("--- Pushing Macro On ---");
		remoteConrol.onButtonWasPressed(0);
		System.out.println("--- Pushing Macro Off ---");
		remoteConrol.offButtonWasPressed(0);
	}

}
