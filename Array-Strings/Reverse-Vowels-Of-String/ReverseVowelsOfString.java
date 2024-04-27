public class ReverseVowelsOfString {
    public static String reverseVowel(String s){
        char[] sArr = s.toCharArray();

        int start =0;
        int end = s.length()-1;

        String vowels = "aeiouAEIOU";

        while(start<end){
            while (start<end){
                char ch = sArr[start];
                if(vowels.indexOf(ch) != -1){
                    break;
                }
                start++;
            }
            while(start<end){
                char ch = sArr[end];
                if(vowels.indexOf(ch)!= -1){
                    break;
                }
                end--;
            }
            if(start<end){
                char temp = sArr[start];
                sArr[start] = sArr[end];
                sArr[end] = temp;
                start++;
                end--;
            }
        }
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
