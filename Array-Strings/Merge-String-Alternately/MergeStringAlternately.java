class MergeStringAlternately{

    public static String mergeAlternately(String word1, String word2){
        
        char[] merge = new char[word1.length()+word2.length()];

        int i=0, j=0;

        while(i<word1.length() && j<word2.length()){
            merge[i+j] = word1.charAt(i++);
            merge[i+j] = word2.charAt(j++);
        }

        while(i<word1.length()){
            merge[i+j] = word1.charAt(i++);
        }
        while (i<word2.length()) {
            merge[i+j] = word2.charAt(j++);
        }
        return new String(merge);
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "efgh";
        if(mergeAlternately(s1, s2).equals("aebfcgdh")){
            System.out.println("Merge Alternatively Successful");
        }
        else{
            System.out.println("Please check the code");
        }
    }
}