public class CountingBits {
    public static int[] countBits(int n){
        int ans[] = new int[n+1];
        ans[0] = 0;
        for(int i = 1; i<=n; i++){
            String convertToBinary = Integer.toBinaryString(i);
            ans[i] = countOne(convertToBinary);
        }
        return ans;
    }
    public static int countOne(String num){
        int count = 0;
        for(int i=0; i<num.length(); i++){
            if(num.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 5;
        int[] ans = new int[n+1];
        ans = countBits(n);
        System.out.println("[");
        for(int i =0; i<ans.length; i++){
            System.out.println(ans[i] + " ");
        }
        System.out.println("]");   
    }
}
