/*
 * Description: This code presents traffic light colors and does function as regular traffic light. input
 * Written by: Anaberdi Meredov
 * Date Written: 2022.03.21
 * GitHub: https://github.com/sherlock59/midTraffick
 */

public class TrafficLight {

	// This piece of code presumably should allow to test the code if everything was coded in order
	/*public static void main(String args[]) {
		TrafficLight light = new TrafficLight();
		light.displayLight();
		System.out.println();
		
		light.setRedOn();
		light.displayLight();
		System.out.println();
	} 
	*/
	//defining Instance fields with boolean data types
	private boolean red;
	private boolean green;
	private boolean yellow;
	//defining class fields
	private static final String Reset = "\033[0m";
	private static final String Red = "\033[31;7m";
	private static final String Yellow = "\033[33;7m";
	private static final String Green = "\033[32;7m";
	
	void TrafficfLight() { // setting up default constructor for all instances fields
		this.green = false;
		this.yellow = false;
		this.red = true;
	}
	// Eclipse Source setters and getters generator for green, yellow, and red only
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
	
	public void displayLight() { // Displaying lights according to the traffic light
		
	    if (red) {
	      System.out.println(Red + "Red" + Reset);}
	    else if (yellow) {
     		System.out.println(Yellow + "Yellow" + Reset);}
     	else if (green) { 
     		System.out.println(Green + "Green" + Reset);}
     	else {
     		System.out.println("All Lights Off");}
	}
}