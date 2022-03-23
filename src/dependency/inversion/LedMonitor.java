package dependency.inversion;

public class LedMonitor implements IMonitor {
	
	public LedMonitor() {
		this.printType();
	}
	
	@Override
	public void printType() {
		System.out.println("I'm : " + this.getClass().getName());
	}
}
