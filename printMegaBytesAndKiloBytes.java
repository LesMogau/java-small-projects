public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0) {
        System.out.println("Invalid Value");
    } else {
        int megabytes = kiloBytes / 1024;
        int remainingKilobytes = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKilobytes + " KB");
    }
}

/*

Explanation:
Input Validation: The method first checks if the kiloBytes value is less than 0. If so, it prints "Invalid Value" and exits the method.
Conversion:
Megabytes Calculation: kiloBytes / 1024 calculates how many whole megabytes fit into the given kilobytes.
Remaining Kilobytes: kiloBytes % 1024 calculates the remainder of kilobytes that don't complete another megabyte.
Output: The method then prints the result in the required format using System.out.println().*/
