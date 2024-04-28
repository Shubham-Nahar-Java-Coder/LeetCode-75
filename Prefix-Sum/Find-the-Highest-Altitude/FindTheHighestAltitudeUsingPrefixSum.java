import java.util.ArrayList;
import java.util.List;

public class FindTheHighestAltitudeUsingPrefixSum {
    public static int largestAltitude(int[] gain) {
        // Create a prefixList to store altitudes
        List<Integer> prefixList = new ArrayList<>();
        
        int max = 0;
        int altitude = 0;
        
        // Add initial altitude of 0 to the prefixList
        prefixList.add(0);
        
        // Iterate over the gain array to calculate altitudes
        for (int i = 0; i < gain.length; i++) {
            
            altitude = altitude + gain[i];
            // Add the current altitude to the prefixList
            prefixList.add(altitude);
        }

        // Iterate over the list to find the maximum altitude
        for (int i = 0; i < prefixList.size(); i++) {
            if (prefixList.get(i) > max) {
                max = prefixList.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain = { -5, 1, 5, 0, -7 };
        System.out.println("Highest Altitude Reached: " + largestAltitude(gain));
    }
}
