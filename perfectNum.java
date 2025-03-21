public static boolean isPerfectNumber(int number) {
    // If the number is less than 1, return false
    if (number < 1) {
        return false;
    }
    
    int sumOfDivisors = 0;
    
    // Loop from 1 to number / 2 to find proper divisors
    for (int i = 1; i <= number / 2; i++) {
        if (number % i == 0) { // If i divides number evenly
            sumOfDivisors += i;
        }
    }
    
    // Check if the sum of divisors equals the original number
    return sumOfDivisors == number;
}
