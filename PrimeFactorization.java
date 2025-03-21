public class PrimeFactorization {

    public static int getLargestPrime(int number) {
        // Handle invalid numbers (negative or 0, 1)
        if (number <= 1) {
            return -1;
        }
        
        int largestPrime = -1;

        // Divide the number by 2 as much as possible
        while (number % 2 == 0) {
            largestPrime = 2;
            number /= 2;
        }

        // Try dividing by odd numbers from 3 upwards
        for (int i = 3; i * i <= number; i += 2) {
            while (number % i == 0) {
                largestPrime = i;
                number /= i;
            }
        }

        // If number is greater than 2, then it is prime itself
        if (number > 2) {
            largestPrime = number;
        }

        return largestPrime;
    }
}
