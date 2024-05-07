
class GuessGame {
  private int pickedNumber;

  public int guess(int num) {
    if (num < pickedNumber) {
      return 1;
    } else if (num > pickedNumber) {
      return -1;
    } else {
      return 0;
    }
  }

  public void setPickedNumber(int pickedNumber) {
    this.pickedNumber = pickedNumber;
  }
}

public class GuessNumberHigherorLower extends GuessGame {
  public int guessGame(int n) {
    int start = 1;
    int end = n;
    // Binary search loop
    while (start <= end) {
      int mid = (start + (end - start)) / 2; // Calculate midpoint
      if (guess(mid) == 0) {
        return mid; // If guessed number is correct, return it
      }
      // If guessed number is lower, adjust start to search in the upper half
      else if (guess(mid) == 1) {
        start = mid + 1;
      }
      // If guessed number is higher, adjust end to search in the lower half
      else {
        end = mid - 1;
      }
    }
    return -1; // If picked number is not found, return -1
  }

  public static void main(String[] args) {
    GuessNumberHigherorLower guessNumber = new GuessNumberHigherorLower();
    int pickedNumber = 6;

    guessNumber.setPickedNumber(pickedNumber);

    int n = 10;
    int guessedNumber = guessNumber.guessGame(n);

    System.out.println("Guessed Number" + guessedNumber);
  }
}