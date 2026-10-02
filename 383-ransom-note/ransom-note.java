class Solution {
    public boolean canConstruct(String ran, String mag) {
        int count[]=new int[26];
        for(char c:mag.toCharArray()){
            count[c-'a']++;
        }
        for(char c:ran.toCharArray()){
            if(count[c-'a']==0){
                return false;
            }
            count[c-'a']--;
        }
        return true;
    }
}