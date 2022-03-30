/*
 * Description: This code presents traffic light colors and does function as regular traffic light. input
 * Written by: Anaberdi Meredov
 * Date Written: 2022.03.21
 * GitHub: https://github.com/sherlock59/midTraffick
 */

public class Intersection {
	
	/*public static void main(String name[]) {
		Intersection intersection1 = new Intersection("some street name");
		intersection1.displayLight();
	}    */
	// initializing instance fields
	private String name;
	private TrafficLight eastbound;
	private TrafficLight westbound;
	private TrafficLight northbound;
	private TrafficLight southbound;
	public boolean isNorthboundYellow = northbound.isYellow();
	public boolean isEastboundYellow = eastbound.isYellow();
	
    Intersection() { // default constructor 
		name = null; // initializing
		eastbound = new TrafficLight();
		westbound = new TrafficLight();
		northbound = new TrafficLight();  // testing purposes 
		southbound = new TrafficLight();  // testing purposes
		
		eastbound.setGreenOn();
		westbound.setGreenOn();
//		northbound.setRedOn();  // testing purposes
//		southbound.setYellowOn();  // testing purposes
	}
    
	Intersection(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void displayLight() {
		System.out.print(this.name + "Intersection");
		System.out.print("  Eastbound is ");
		eastbound.displayLight();
		System.out.println();
		
		System.out.print(" Westbound is ");
		westbound.displayLight();
		
		System.out.print(" Northbound is ");
		northbound.displayLight();
		
		System.out.print(" Southbound is ");
		southbound.displayLight();
	}
	
	public void stopTraffic() {
		eastbound.setRedOn();
		westbound.setRedOn();
		northbound.setRedOn();
		southbound.setRedOn();
	}
     public void switchTraffic() {
		if(eastbound.isGreen()) {
		   eastbound.setYellowOn();
	       westbound.setYellowOn();
	    } else if (eastbound.isYellow()) {
			       eastbound.setRedOn();
			       westbound.setRedOn();}
	      else if (eastbound.isRed() && isNorthboundYellow) {
	    	       eastbound.setGreenOn();
	    	       westbound.setGreenOn();}
		
		if(northbound.isGreen()) {
			northbound.setYellowOn();
			southbound.setYellowOn();}
		else if(northbound.isYellow()) {
			northbound.setRedOn();
			southbound.setRedOn();}
		else if (northbound.isRed() && isEastboundYellow) {
			northbound.setGreenOn();
			southbound.setGreenOn();}
		}
  }
	
