import java.util.*;

public class FindTheDifferenceOfTwoArrays{
  public static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
    HashSet<Integer> set1 = new HashSet<>();
    
    for(int values: nums1){
      set1.add(values);
    }

    HashSet<Integer> set2 = new HashSet<>();
    for(int values: nums2){
      set2.add(values);
    }

    HashSet<Integer> differenceSet1 = new HashSet<>();
    for(int values: nums1){
      if(set2.contains(values) == false){
        differenceSet1.add(values);
      }
    }

    HashSet<Integer> differenceSet2 = new HashSet<>();
    for(int values: nums2){
      if(set1.contains(values) == false){
        differenceSet2.add(values);
      }
    }
    return Arrays.asList(new ArrayList<>(differenceSet1), new ArrayList<>(differenceSet2));
  }
  public static void main(String[] args) {
    int[] num1 = {1,2,3};
    int[] num2 = {2,4,6};
    System.out.print(findDifference(num1, num2));
  }
}