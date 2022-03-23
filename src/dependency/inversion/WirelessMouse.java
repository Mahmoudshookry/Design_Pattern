package dependency.inversion;

public class WirelessMouse implements IMouse {
	
	public WirelessMouse() {
		this.printType();
	}

	@Override
	public void printType() {
		System.out.println("I'm : " + this.getClass().getName());
	}

}
