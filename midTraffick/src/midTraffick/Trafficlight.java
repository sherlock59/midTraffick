public class TrafficLight {
	
	private boolean red;
	private boolean green;
	private boolean yellow;
	private static final String Reset = "\033[0m";
	private static final String Red = "\033[31;7m";
	private static final String Yellow = "\033[33;7m";
	private static final String Green = "\033[32;7m";
	
	TrafficLight() {
		this.green = false;
		this.yellow = false;
		this.red = true;
	}

	public boolean isRed() {
		return red;
	}

	public void setRed(boolean red) {
		this.red = red;
	}

	public boolean isGreen() {
		return green;
	}

	public void setGreen(boolean green) {
		this.green = green;
	}

	public boolean isYellow() {
		return yellow;
	}

	public void setYellow(boolean yellow) {
		this.yellow = yellow;
	}
}