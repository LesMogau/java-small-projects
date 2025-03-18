public class Main {
    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome(-1221));  // should return true
        System.out.println(isPalindrome(707));    // should return true
        System.out.println(isPalindrome(11212));  // should return false
        System.out.println(isPalindrome(-222));   // should return true (as palindrome)
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;  // Store the original number
        number = Math.abs(number);    // Take the absolute value to ignore the sign
        
        int reverse = 0;              // Initialize the reverse number to 0

        while (number > 0) {
            int lastDigit = number % 10;  // Get the last digit of the number
            reverse = reverse * 10 + lastDigit; // Add the last digit to the reverse
            number = number / 10;          // Remove the last digit from number
        }

        // Return true if the original number is equal to the reversed number
        return originalNumber == reverse || originalNumber == -reverse;
    }
}
