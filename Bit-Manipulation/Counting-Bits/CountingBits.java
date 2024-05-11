public class CountingBits {
    public static int[] countBits(int n) {
        // Initialize an array to store the count of set bits for each number
        int ans[] = new int[n + 1];
        // For 0, there are no set bits, so initialize its count to 0
        ans[0] = 0;
        for (int i = 1; i <= n; i++) {
            // Convert the current number to its binary representation
            String convertToBinary = Integer.toBinaryString(i);
            // Count the number of set bits in the binary representation
            ans[i] = countOne(convertToBinary);
        }
        return ans;
    }

    public static int countOne(String num) {
        int count = 0;
        // Iterate through each character of the binary string
        for (int i = 0; i < num.length(); i++) {
            // If the current character is '1', increment the count
            if (num.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] ans = new int[n + 1];
        ans = countBits(n);
        System.out.println("[");
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");
        }
        System.out.println("]");
    }
}
