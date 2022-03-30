/*
 * Description: This code presents traffic light colors and does function as regular traffic light. input
 * Written by: Anaberdi Meredov
 * Date Written: 2022.03.21
 * GitHub: https://github.com/sherlock59/midTraffick
 */

public class TrafficController {
	private Intersection intersection1;
	private Intersection intersection2;
	private final static String doubleLine = "==================================";
	
	TrafficController() {
		intersection1 = new Intersection("50th & address");
		intersection2 = new Intersection("49th & address");
	}
	public void controlTraffic() {
		int menuChoice = -1;
		while(menuChoice !=0) {
			menuChoice = getMenuChoice();
			switch (menuChoice) {
			case 0:
			   break;
			case 1:
			   this.switchAll();
			   this.displayAll();
			   break;
			case 2:
				this.stopAll();
				this.displayAll();
				break;
			default:
				System.out.println("Choice" + menuChoice + " is Invalid. Please choose again");
		}
	}
}
	private int getMenuChoice() {
		System.out.println(doubleLine);
		System.out.println("The Traffic Light Controller");
		System.out.println(doubleLine);
		System.out.println();
		System.out.println("0 = Exit System");
		System.out.println("1 = Switch All Traffic");
		System.out.println("2 = Stop All Traffic\n");
		int userInput = Input.getIntRange("Please enter a Menu Selection: ", 0, 3);
		System.out.println("");
		System.out.println(doubleLine);
		System.out.println("");
		return userInput;
	}
	public void switchAll() {  //  coding a shell to prove if it can call
		intersection1.switchTraffic();
		intersection2.switchTraffic();
	}
	public void stopAll() {
		intersection1.stopTraffic();
		intersection2.stopTraffic();
	}
	public void displayAll() {
		intersection1.displayLight();
		intersection2.displayLight();
	} 
}