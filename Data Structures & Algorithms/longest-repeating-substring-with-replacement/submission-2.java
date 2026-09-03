class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,ans=0,maxFreq=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            int currFreq=map.get(s.charAt(right));
            maxFreq=Math.max(currFreq,maxFreq);
            int winLength=right-left+1;
            while((right-left+1)-maxFreq>k){
                char temp=s.charAt(left);
                map.put(temp,map.get(temp)-1);
                left++;
            }
           ans=Math.max(ans,right-left+1);
        }
    return ans;
    }
}
