
public class TravelTimeCalculatorApp {

	public static void main(String[] args) {
		double miles, mph, distHours, distMins; 
		int hours, mins;
				
		String choice = "y";
		Console.printWelcome();
		
		while (choice.equalsIgnoreCase("y")) {
			miles = Console.getDouble("Enter miles: \t");
			mph   = Console.getDouble("Enter mph:   \t");
			distHours = miles / mph;
			hours = (int)distHours;
			distMins = ((miles % mph) * 60);
			mins = (int)distMins / (int)mph;
			
			System.out.println();
			System.out.println();
			System.out.println("Estimated Travel Time");
			System.out.println("---------------------");
			System.out.println("Hours:  \t" + hours);
			System.out.println("Minutes:\t" + mins);
			
			choice = Console.getChoiceString("Continue(y/n) :", "y", "n");		
		}
		Console.printBye();
	}	
}
