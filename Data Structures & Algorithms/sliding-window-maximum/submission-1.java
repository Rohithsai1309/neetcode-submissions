class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> sum=new ArrayList<>();
        for(int i=0;i<=nums.length-k;i++){
            int max=nums[i];
            for(int j=i;j<i+k;j++){
                if(nums[j]>max)max=nums[j];
            }
            sum.add(max);
        }
        int[] ans=new int[sum.size()];
        for(int i=0;i<sum.size();i++){
            ans[i]=sum.get(i);
        }
    return ans;
    }
}
