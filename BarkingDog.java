
public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // Check if hourOfDay is valid (0-23)
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        // Check if the dog is barking and the time is before 8 AM or after 10 PM
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }

        // Otherwise, return false
        return false;
    }
}
