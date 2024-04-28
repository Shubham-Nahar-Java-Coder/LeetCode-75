public class FindTheHighestAltitudeEasySolution {
    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;

        // Iterate over each altitude change in the gain array
        for (int altitude : gain) {
            
            // Update current altitude by adding the altitude change
            currentAltitude = currentAltitude + altitude;

            // Update max altitude to the maximum between current and max altitude
            maxAltitude = Math.max(currentAltitude, maxAltitude);
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println("Highest Altitude Reached: " + largestAltitude(gain));
    }
}
