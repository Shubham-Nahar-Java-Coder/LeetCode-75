public class ReverseWordsInAStringUsingSwapping {
    public static String reverseWords(String s) {
        String[] words = s.split("\\s+");
        int start = 0;
        int end = words.length - 1;

        while (start < end) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", words).trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
}
