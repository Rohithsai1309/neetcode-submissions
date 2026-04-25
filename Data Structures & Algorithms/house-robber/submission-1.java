class Solution {
    public int rob(int[] nums) {
        int prev1=0;
        int prev2=0;
        for(int i:nums){
            int curr=Math.max(prev2+i,prev1);
            prev2=prev1;
            prev1=curr;
        }
    return prev1;
    }
}
