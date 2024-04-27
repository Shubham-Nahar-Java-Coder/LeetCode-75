public class GreatestCommonDivisorOfString {
    public static String gcdOfString(String s1, String s2){
        
        // If the length of s2 is greater than the length of s1, swap s1 and s2
        if (s2.length()>s1.length()) {
            return gcdOfString(s2, s1);
        }

        // if s1 is equal to s2. If it is, return s1
        if(s1.equals(s2)){
            return s1;
        }

        //If s2 is a prefix of s1, 
        //recursively call the function gcdOfString with the remaining part of s1 after removing s2 and s2
        if(s1.startsWith(s2)){
            return gcdOfString(s1.substring(s2.length()), s2);
        }
        //If none of the above conditions match, return an empty string
        else{
            return "";
        }
    }
    public static void main(String[] args) {
        String s1 = "ABABAB";
        String s2 = "ABAB";
        if(gcdOfString(s1, s2).equals("AB")){
            System.out.println("Greatest Divisor Found");
        }
        else{
            System.out.println("Check Code");
        }
    }
    
}
