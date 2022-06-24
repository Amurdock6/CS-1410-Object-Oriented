// Alexander Murdock

package docComments;

import java.util.Scanner;

public class LaptopFinderApp {
	

	public static void main(String[] args) {
		
		Laptops newlaptop = new Laptops(null, null, null);
		try (Scanner myObj = new Scanner(System.in)) {
			int loop = 0;
			
			while (loop !=1) {
				String userInput = null;
				
					// Handels user inputs
					System.out.println("1. Show all laptops");
					System.out.println("2. Add a laptop");
					System.out.println("3. Find a laptop");
					System.out.println("4. Delete a laptop");
					System.out.println("5. Number of laptops");
					System.out.println("6. Exit");
					System.out.println("Enter your selection:" );
					userInput = myObj.nextLine();  // Read user input
					System.out.println();

					
					// Converts user input from a string to an integer
					int convertedInput = Integer.parseInt(userInput);
					
					// Handels user inputs
					if (convertedInput > 6) {
						System.out.println("Enter a selection 1 - 6");
					} else if (convertedInput == 6) {
						System.out.println("Goodbye");
						break;
					} else if (convertedInput == 5) {
						newlaptop.numberOfLaptops();
					} else if (convertedInput == 4) {
						System.out.println("ID:");
						String id = myObj.nextLine();
//						int findId = Integer.parseInt(id);
						newlaptop.removeLaptop(id);
					} else if (convertedInput == 3) {
						System.out.println("ID:");
						String id = myObj.nextLine();
						newlaptop.findLaptop(id);
					} else if (convertedInput == 2) {
						System.out.println("GPU:");
						String cpu = myObj.nextLine();
						System.out.println("CPU:");
						String gpu = myObj.nextLine();
						System.out.println("Battery Life:");
						String batterylife = myObj.nextLine();
						
						newlaptop.addLaptop(gpu, cpu, batterylife);
					} else if (convertedInput == 1) {
						newlaptop.printAllLaptops();
					} else if (convertedInput < 1) {
						System.out.println("Enter a selection 1 - 6");
					} else {
						System.out.println("Error please try again.");
					}
					
					System.out.println();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
