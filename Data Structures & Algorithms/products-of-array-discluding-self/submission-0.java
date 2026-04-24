class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[]  prefix=new int[nums.length];
        int[]  suffix=new int[nums.length];
        int[]  ans=new int[nums.length];
        int pSum=1;
        int sSum=1;
        for(int i=0;i<nums.length;i++){
            prefix[i]=pSum;
            pSum*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            suffix[i]=sSum;
            sSum*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=prefix[i]*suffix[i];
        }
    return ans;

    }
}  
