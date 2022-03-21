/*
 * Description: This code presents traffic light colors and does function as regular traffic light. input
 * Written by: Anaberdi Meredov
 * Date Written: 2022.03.21
 * GitHub: https://github.com/sherlock59/InvoiceApp.git
 */

public class Intersection {
	
/*	public static void main(String name[]) {
		Intersection intersection1 = new Intersection("some street name");
		intersection1.displayLight();
	}   */
	
	private String name;
	private TrafficLight eastbound;
	private TrafficLight westbound;
	private TrafficLight northbound;
	private TrafficLight southbound;
	
    Intersection() {
		name = null;
		eastbound = new TrafficLight();
		westbound = new TrafficLight();
		northbound = new TrafficLight();
		southbound = new TrafficLight();
		
		eastbound.setGreenOn();
		westbound.setGreenOn();
//		northbound.setGreenOn(false);
//		southbound.setGreenOn(false);
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
			       westbound.setRedOn();
	    }
     }
}

