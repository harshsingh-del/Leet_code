class Solution {
    public int maximumWealth(int[][] acc) {
        int sum=0;
        int sum2=0;
        for(int i=0;i<acc.length;i++){
           for(int j=0;j<acc[0].length;j++){
           sum=sum+acc[i][j];
           }
            sum2=Math.max(sum,sum2);
           sum=0;
        }
        return sum2;
    
    }
}