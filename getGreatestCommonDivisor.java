public static int getGreatestCommonDivisor(int first, int second) {
    // Check for invalid values
    if (first < 10 || second < 10) {
        return -1;
    }
    
    // Find the minimum of the two numbers
    int min = Math.min(first, second);
    
    // Loop through numbers from min down to 1
    for (int i = min; i >= 1; i--) {
        // Check if both numbers are divisible by i
        if (first % i == 0 && second % i == 0) {
            return i; // Return the first divisor that divides both numbers
        }
    }
    
    return -1; // This is a safeguard; theoretically, this line should never be reached.
}
