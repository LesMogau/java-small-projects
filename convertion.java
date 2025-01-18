public class SpeedConverter {

    // Method to convert kilometers per hour to miles per hour and round the result
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1; // Return -1 for invalid input
        }
        
        // Convert km/h to mi/h (1 km = 0.621371 miles)
        double milesPerHour = kilometersPerHour * 0.621371;
        
        // Round the result to the nearest long using Math.round
        return Math.round(milesPerHour);
    }

    // Method to print the conversion result in the required format
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value"); // Handle invalid input
        } else {
            // Get the rounded miles per hour and print the formatted message
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
