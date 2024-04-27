import java.util.ArrayList;
import java.util.List;

public class KidsWithGreatestNumberOfCandies {
    public static List<Boolean> kidsWithMaxCandies(int[] candies, int extraCandies){
        
        //Array List to Store Boolean Values
        ArrayList<Boolean> candyList = new ArrayList<>();

        // max is initialized to 0, assuming that extra candies will always be a non-negative number
        int max = 0; 

        // Iterate through the 'candies' array to calculate the maximum value
        for (int i = 0; i < candies.length; i++) {
            int val = candies[i];

            if (val>max) {
                max = val;
            }
        }

        // Iterate through the 'candies' array to add extra candies and check if candies + extraCandies
        for (int i = 0; i < candies.length; i++) {
            // is greater than or equal to 'max'. If true, add 'true' to the Boolean ArrayList 'candyList';
            if (candies[i] + extraCandies >= max) {
                candyList.add(true);
            }
            // otherwise, add 'false'.
            else{
                candyList.add(false);
            }
        }
        return candyList;
    }
    public static void main(String[] args) {
        int [] candies = {1,3,5,2,1};
        int extraCandies = 3; 
        System.out.println("Boolean List= "+kidsWithMaxCandies(candies, extraCandies));
    }
}
