class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int ans=Integer.MAX_VALUE,left=0,sum=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>=t){
                ans=Math.min(ans,right-left+1);
                sum-=nums[left++];
            }
        }
    return ans==Integer.MAX_VALUE?0:ans;
    }
}