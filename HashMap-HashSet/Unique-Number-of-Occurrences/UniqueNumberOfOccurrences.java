import java.util.*;

public class UniqueNumberOfOccurrences {
    public static boolean uniqueOccurance(int[] arr) {
        // HashMap to store the frequency of each element in the array
        HashMap<Integer, Integer> numberFrequencyMap = new HashMap<>();

        for (int element : arr) {
            // Increment the count for the current element in the HashMap
            numberFrequencyMap.put(element, numberFrequencyMap.getOrDefault(element, 0) + 1);
        }

        // HashSet to keep track of unique frequencies encountered
        HashSet<Integer> uniqueCheck = new HashSet<>();
        for (int value : numberFrequencyMap.values()) {
            // If the frequency is already present in the HashSet, return false
            if (uniqueCheck.contains(value)) {
                return false;
            } else {
                // Add the frequency to the HashSet if it's not already present
                uniqueCheck.add(value);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 1, 3 };
        System.out.println(uniqueOccurance(arr));
        int[] arr1 = { 1, 2 };
        System.out.println(uniqueOccurance(arr1));
        int[] arr2 = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
        System.out.println(uniqueOccurance(arr2));
    }
}
