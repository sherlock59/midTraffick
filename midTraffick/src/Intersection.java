public class Intersection {
	
/*	public static void main(String name[]) {
		Intersection intersection1 = new Intersection("23123wa3e2q3");
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
		
		eastbound.setGreenOn(true);
		westbound.setGreenOn(true);
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
		if(eastbound.isGreen(true)) {
		   eastbound.setYellowOn(false);
	       westbound.setYellowOn(false);
	    } else if (eastbound.isYellow()) {
			       eastbound.setRedOn(false);
			       westbound.setRedOn(false);
	    } else if (eastbound.isRed(true);
	    	eastbound.setGreenOn(false);
	    	westbound.setGreenOn(false);
	    }
}
