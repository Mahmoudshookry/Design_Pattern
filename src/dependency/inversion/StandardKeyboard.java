package dependency.inversion;

public class StandardKeyboard implements IKeyboard {
	
	public StandardKeyboard() {
		this.printType();
	}
	
	@Override
	public void printType() {
		System.out.println("I'm : " + this.getClass().getName());
	}

}
