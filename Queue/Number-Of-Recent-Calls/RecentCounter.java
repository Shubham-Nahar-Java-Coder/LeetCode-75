import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
  // Queue to store recent requests
  Queue<Integer> queue;

  // Constructor to initialize the queue
  public RecentCounter() {
    queue = new LinkedList<>();
  }

  // Method to handle incoming ping requests and
  // Return the number of recent requests within the last 3000 milliseconds
  public int ping(int t) {
    // If the queue is empty, add the current request to the queue and return 1
    if (queue.size() == 0) {
      queue.offer(t);
      return 1;
    } else {
      // If the current request is within the last 3000 milliseconds, add it to the
      // queue
      if (t <= 3000) {
        queue.offer(t);
      } else {
        // If the current request is beyond 3000 milliseconds, remove older requests
        // until the queue contains only requests within the last 3000 milliseconds
        int margin = t - 3000;
        while (queue.size() != 0 && queue.peek() < margin) {
          queue.poll();
        }
        queue.offer(t);
      }
      return queue.size();
    }
  }

  public static void main(String[] args) {
    RecentCounter obj = new RecentCounter();
    String[] operations = { "RecentCounter", "ping", "ping", "ping", "ping" };
    Integer[][] input = { {}, { 1 }, { 100 }, { 3001 }, { 6003 } };
    Integer[] output = new Integer[operations.length];

    for (int i = 0; i < operations.length; i++) {
      switch (operations[i]) {
        case "RecentCounter":
          // Create a new instance of RecentCounter
          obj = new RecentCounter();
          // Set output value to null (placeholder for constructor call)
          output[i] = null;
          break;
        case "ping":
          output[i] = obj.ping(input[i][0]);
          break;
      }
    }
    for (Integer value : output) {
      System.out.print(value + " ");
    }
  }
}
