import java.util.ArrayList;
import java.util.List;

public class FindTheHighestAltitudeUsingPrefixSum {
    public static int largestAltitude(int[] gain) {
        List<Integer> prefixList = new ArrayList<>();
        int max = 0;
        int altitude = 0;
        prefixList.add(0);
        for (int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];
            prefixList.add(altitude);
        }
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
