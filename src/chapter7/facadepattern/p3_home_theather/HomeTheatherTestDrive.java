package chapter7.facadepattern.p3_home_theather;

public class HomeTheatherTestDrive {

	public static void main(String[] args) {
		Amplifier amp = new Amplifier("Top-O-Line Amplifier");
		Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
		DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
		CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
		Projector projector = new Projector("Top-O-Line Projector", dvd);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");
		
		HomeTheatherFacade homeTheather = new HomeTheatherFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);
		homeTheather.watchMovie("Raiders of the Lost Ark");
		homeTheather.endMovie();
	}

}
