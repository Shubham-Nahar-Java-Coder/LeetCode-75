import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {

    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] word1Frequency = new int[26];
        int[] word2Frequency = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            word1Frequency[word1.charAt(i) - 'a']++;
            word2Frequency[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((word1Frequency[i] == 0 && word2Frequency[i] != 0)
                    || (word2Frequency[i] == 0 && word1Frequency[i] != 0)) {
                return false;
            }
        }
        Arrays.sort(word1Frequency);
        Arrays.sort(word2Frequency);

        return Arrays.equals(word1Frequency, word2Frequency);
    }

    public static void main(String[] args) {
        String s1 = "cabbba";
        String s2 = "abbccc";
    }
}
