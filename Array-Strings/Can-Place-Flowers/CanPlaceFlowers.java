public class CanPlaceFlowers {

    public static boolean canPlaceFlower(int[] flowerbed, int n){
        
        // Check for edge case: If n is 0, there is no need to perform any further task.
        if (n == 0) {
            return true;
        }

        int count =0;

        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current index is 0, and if isAvailable method returns true
            //Then we increment the value of count
            // Change the index to va1ue to 1
            if(flowerbed[i]== 0 && isAvailable(flowerbed, i)){
                count++;
                flowerbed[i]=1;
            }
            //check if count isEqual to n; then we can say we hava placed all the flowers
            if(count == n){
                return true;
            }
        }
        // if count is not equal to n; then we have few flowers left; so we return false;
        return false;
    }

    private static boolean isAvailable(int[] flowerbed, int i) {
        //checks if adjucent values from the index has 1, if then we return false;
        if(i-1>=0 && flowerbed[i-1]==1 || i+1 < flowerbed.length && flowerbed[i+1]==1){
            return false;
        }
        //else, we return true
        return true;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,1,0,0};
        int n = 1;
        if(canPlaceFlower(flowerbed, n) == true){
            System.out.println("Recieved Expected Output");
        }
        else{
            System.out.println("Check The Code");
        }
    }
}
