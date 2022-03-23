package dependency.inversion;

public interface IMouse {
	
	default void printType() {
		System.out.println("default");
	}
}
