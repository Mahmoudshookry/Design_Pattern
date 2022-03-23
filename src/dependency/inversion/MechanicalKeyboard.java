package dependency.inversion;

public class MechanicalKeyboard implements IKeyboard {
	
	public MechanicalKeyboard() {
		this.printType();
	}
	
	@Override
	public void printType() {
		System.out.println("I'm : " + this.getClass().getName());
	}

}
