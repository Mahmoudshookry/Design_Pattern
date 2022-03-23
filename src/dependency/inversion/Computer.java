package dependency.inversion;

public class Computer {
	
	private IMouse myMouse;
	private IKeyboard myKeyboard;
	private IMonitor myMonitor;
	
	public Computer(IMouse mouse, IKeyboard keyboard, IMonitor monitor) {
		this.myMouse = mouse;
		this.myKeyboard = keyboard;
		this.myMonitor = monitor;
	}

}
