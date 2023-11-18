public class MilesPerGallon {

	public static void main(String[] args) {
        double milesDriven; // Miles driven
        double gallonsUsed; // Gallons of gas used
        double mpg;         // Miles per gallon

        // Create a Scanner object to read input.
        Scanner keyboard = new Scanner(System.in);

        // Get the number of miles driven.
        System.out.print("Enter the number of miles driven: ");
        milesDriven = keyboard.nextDouble();

        // Get the number of gallons of gas used.
        System.out.print("Enter the gallons of gas used: ");
        gallonsUsed = keyboard.nextDouble();

        // Calculate miles per gallon (MPG).
        mpg = milesDriven / gallonsUsed;

        // Display the resulting information.
        System.out.println("Your miles per gallon (MPG) is: " + mpg);

        // Close the Scanner to release resources.
        keyboard.close();

}
}
