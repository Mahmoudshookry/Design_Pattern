package dependency.inversion;

public class StandardMonitor implements IMonitor {
	
	public StandardMonitor() {
		this.printType();
	}
	
	@Override
	public void printType() {
		System.out.println("I'm : " + this.getClass().getName());
	}
}
