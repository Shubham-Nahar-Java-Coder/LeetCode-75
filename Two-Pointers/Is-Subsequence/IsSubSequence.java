public class IsSubSequence{
    public static boolean isSubsequence(String s1, String s2){
      if(s2.length()>s1.length()){
        return isSubsequence(s2, s1);
      }
      int i = 0;
      int j = 0;
  
      while(i<s1.length() && j<s2.length()){
        if(s1.charAt(i) == s2.charAt(j)){
          i++;
          j++;
        }
        else{
          i++;
        }
      }
      return (j==s2.length());
    }
    public static void main(String[] args) {
      String s1 = "ahbgdc";
      String s2 = "abc";
      String s3 = "adb";
      System.out.println(isSubsequence(s1, s2));
      System.out.println(isSubsequence(s2, s1));
      System.out.println(isSubsequence(s1, s3));
    }
  }