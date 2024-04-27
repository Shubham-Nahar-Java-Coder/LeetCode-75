public class ReverseVowelsOfString {
    public static String reverseVowel(String s){

        // Convert the input string to a character array and store it in sArr
        char[] sArr = s.toCharArray();

        int start =0;
        int end = s.length()-1;

        String vowels = "aeiouAEIOU";


        while(start<end){
            while (start<end){
                char ch = sArr[start];
            
                //Check if the char from the start for a vowel. 
                if(vowels.indexOf(ch) != -1){
                    break; // breaks from while loop
                }
                start++;
            }
            while(start<end){
                char ch = sArr[end];

                //Checks if the char from end for a vowel 
                if(vowels.indexOf(ch)!= -1){
                    break; //breaks from while loop
                }
                end--;
            }
            if(start<end){
                // Swap the positions of vowels found at indices 'start' and 'end'.
                char temp = sArr[start];
                sArr[start] = sArr[end];
                sArr[end] = temp;
                start++;
                end--;
            }
        }
        // Convert the character array 'sArr' to a String object and return it as a new object
        return new String(sArr); 
    }
    public static void main(String[] args) {
        String s = "leetcode";
        if(reverseVowel(s).equals("leotcede")){
            System.out.println("String reversed");
        }
        else{
            System.out.println("Check your code");
        }
    }
}
