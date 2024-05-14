public class MaximumNumberOfVowelInASubstringOfGivenLength {
    public static int maxVowel(String s, int k){
        
        if(s.isEmpty() || s.length() < k){
            return 0;
        }

        int ans = 0;
        int count = 0;
        // Loop through the first k characters of the string
        for(int i=0; i<k; i++){
            char ch = s.charAt(i);
            // Check if the character is a vowel
            if(isVowel(ch)){
                count++; // If it is, increment the count of vowels
            }
        }
        ans = count;  // Update the answer with the count of vowels in the initial window
         // Iterate through the remaining characters of the string using a sliding window approach
        for(int i = k; i < s.length(); i++){
            char newElement = s.charAt(i); // Get the new character entering the window
            char removeElement = s.charAt(i-k); // Get the character leaving the window
            // Check if the new character is a vowel
            if(isVowel(newElement)){
                count++;
            }
            // Check if the character leaving the window is a vowel
            if(isVowel(removeElement)){
                count--;
            }
            ans = Math.max(ans, count);
        }
        return ans;        
    }

    public static void main(String[] args) {
        String s = "LeetCode";
        int k = 3;
        System.out.println(maxVowel(s, k));
    }

    private static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
}
