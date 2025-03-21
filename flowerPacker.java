public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // If any of the inputs are negative, return false
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        // Maximize the use of big bags
        int maxBigBagsUsed = Math.min(goal / 5, bigCount);

        // Subtract the weight provided by the big bags from the goal
        int remainingGoal = goal - (maxBigBagsUsed * 5);

        // If the remaining goal can be fulfilled with small bags
        return remainingGoal <= smallCount;
    }
}
