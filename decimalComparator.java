public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
    // Cast both numbers to an integer after multiplying by 1000 to focus on the first three decimal places
    int num1Rounded = (int) (num1 * 1000);
    int num2Rounded = (int) (num2 * 1000);
    
    // Compare the rounded values
    return num1Rounded == num2Rounded;
}
