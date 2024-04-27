public class CanPlaceFlowers {

    public static boolean canPlaceFlower(int[] flowerbed, int n){
        if (n == 0) {
            return true;
        }
        int count =0;

        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i]== 0 && isAvailable(flowerbed, i)){
                count++;
                flowerbed[i]=1;
            }
            if(count == n){
                return true;
            }
        }
        return false;
    }

    private static boolean isAvailable(int[] flowerbed, int i) {
        if(i-1>=0 && flowerbed[i-1]==1 || i+1 < flowerbed.length && flowerbed[i+1]==1){
            return false;
        }
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
