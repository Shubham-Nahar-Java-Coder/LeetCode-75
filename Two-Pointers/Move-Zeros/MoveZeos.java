public class MoveZeos{
    public static int[] moveZero(int[] arr){
      
      //Initialize the position where non-zero elements will be inserted  
      int insertPosition = 0;
  
      for (int i = 0; i < arr.length; i++) {
        // Checks if the current element is not zero
        if(arr[i] != 0){
        // Move the non-zero element to the insert position
          arr[insertPosition] = arr[i];
          insertPosition++;
        }      
      }
      // Fill the remaining positions with zeros
      while(insertPosition < arr.length){
        arr[insertPosition] = 0;
        insertPosition++;
      } 
      return arr;
    }
    public static void main(String[] args) {
      int[] arr = {0,1,0,3,12};
      int[] movedZero = moveZero(arr);
  
      for (int i = 0; i < movedZero.length; i++) {
          System.out.print(" "+movedZero[i]);   
      }
    }
  }