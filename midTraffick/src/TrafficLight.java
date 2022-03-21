public class TrafficLight {
	
	/*public static void main(String args[]) {
		TrafficLight light = new TrafficLight();
		light.displayLight();
		System.out.println();
		
		light.setRedOn();
		light.displayLight();
		System.out.println();
	} */
	
	private boolean red;
	private boolean green;
	private boolean yellow;
	private static final String Reset = "\033[0m";
	private static final String Red = "\033[31;7m";
	private static final String Yellow = "\033[33;7m";
	private static final String Green = "\033[32;7m";
	
	void TrafficfLight() {
		this.green = false;
		this.yellow = false;
		this.red = true;
	}

	public boolean isRed() {
		return red;
	}

	public void setRedOn() {
		this.green = false;
		this.yellow = false;
		this.red = true;
	}

	public boolean isGreen() {
		return green;
	}

	public void setGreenOn() {
		this.red = false;
		this.yellow = false;
		this.green = true;
	}

	public boolean isYellow() {
		return yellow;
	}

	public void setYellowOn() {
		this.red = false;
		this.green = false;
		this.yellow = true;
	}
	
	public void displayLight() {
		
	    if (red) {
		    System.out.print(Red + "Red" + Reset);}
     	else if (yellow) {
     		System.out.print(Yellow + "Yellow" + Reset);}
     	else if (green) { 
     		System.out.print(Green + "Green" + Reset);}
     	else {
     		System.out.print("All Lights Off");}
	}
}