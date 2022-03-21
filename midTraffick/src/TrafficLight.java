public class TrafficLight {
	
	public static void main(String args[]) {
		TrafficLight light = new TrafficLight();
		light.displayLight();
		System.out.println();
		
		light.setGreenOn();
		light.displayLight();
		light.setYellowOn();
		light.displayLight();
		light.setRedOn();
		light.displayLight();
		System.out.println();
	}
		
		
	
	private void setGreenOn() {
		// TODO Auto-generated method stub
		
	}



	private void setYellowOn() {
		// TODO Auto-generated method stub
		
	}



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

	public void setGreen(boolean green) {
		this.green = true;
		this.red = false;
		this.yellow = false;
	}

	public boolean isYellow() {
		return yellow;
	}

	public void setYellow(boolean yellow) {
		this.yellow = true;
		this.red = false;
		this.green = false;
	}
	
	 void displayLight() {
		
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
	

	
		
