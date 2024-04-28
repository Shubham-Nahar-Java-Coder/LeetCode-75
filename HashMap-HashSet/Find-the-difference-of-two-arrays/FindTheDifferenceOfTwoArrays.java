import java.util.*;

public class FindTheDifferenceOfTwoArrays{
  public static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
    // Create a HashSet to store unique elements from nums1
    HashSet<Integer> set1 = new HashSet<>();

    // Iterate through each element in nums1 and add it to set1
    for(int values: nums1){
      set1.add(values);
    }

    // Create a HashSet to store unique elements from nums2
    HashSet<Integer> set2 = new HashSet<>();

    // Iterate through each element in nums2 and add it to set2
    for(int values: nums2){
      set2.add(values);
    }

    // Create a HashSet to store differences found in nums1
    HashSet<Integer> differenceSet1 = new HashSet<>();
    for(int values: nums1){
      // Check if the element is not present in set2
      if(set2.contains(values) == false){
        differenceSet1.add(values); // If not present, add it to differenceSet1
      }
    }

    HashSet<Integer> differenceSet2 = new HashSet<>();
    // Iterate through each element in nums2
    for(int values: nums2){
      if(set1.contains(values) == false){
        differenceSet2.add(values);
      }
    }
    // Convert differenceSet1 and differenceSet2 to ArrayLists and return them as a list of lists
    return Arrays.asList(new ArrayList<>(differenceSet1), new ArrayList<>(differenceSet2));
  }
  public static void main(String[] args) {
    int[] num1 = {1,2,3};
    int[] num2 = {2,4,6};
    System.out.print(findDifference(num1, num2));
  }
}
