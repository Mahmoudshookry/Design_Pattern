package dependency.inversion;

public class Main {

	public static void main(String[] args) {
		
		Computer computer1 = new Computer(new StandardMouse(), new StandardKeyboard(), new StandardMonitor());
		
		Computer computer2 = new Computer(new WirelessMouse(), new MechanicalKeyboard(), new LedMonitor());

	}

}
