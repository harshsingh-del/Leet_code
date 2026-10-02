class Solution {
    public boolean isBalanced(String num) {
        // int n = Integer.parseInt(num);
        int count=0;
        int count1=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                count+=num.charAt(i)-'0';
            }else{
                count1+=num.charAt(i)-'0';
            }
        }
        return count==count1;
    }
}