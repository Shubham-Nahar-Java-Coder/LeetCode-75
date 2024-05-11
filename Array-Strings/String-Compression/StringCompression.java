class StringCompression {
    public static int compress(char[] chars) {

        StringBuilder sb = new StringBuilder();

        int i = 1;
        int count = 1;
        // Append the first character to the StringBuilder
        sb.append(chars[0]);

        // Iterate through the array starting from index 1
        while (i < chars.length) {
            // If the current character is the same as the previous one
            if (chars[i] == chars[i - 1]) {
                count++; // Increment the counter
            }
            // If the current character is different from the previous one
            else {
                // Append the count of the previous character if it's greater than 1
                if (count > 1) {
                    sb.append(count);
                }
                // Append the current character
                sb.append(chars[i]);
                count = 1; // Reset the counter
            }
            i++;
        }
        // Append the count of the last character if it's greater than 1
        if (count > 1) {
            sb.append(count);
        }
        // Copy the compressed characters back to the original array 'chars'
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }
        return sb.length();
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(compress(chars));
    }
}