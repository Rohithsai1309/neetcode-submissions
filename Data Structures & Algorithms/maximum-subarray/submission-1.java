class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)return nums[0];
        int[] arr=new int[nums.length];
        int max=nums[0];
        int in_max=nums[0];
        int in_min=nums[0];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]+nums[i];
            if(nums[i]>max)max=nums[i];
            if(arr[i]>in_max)in_max=arr[i];
            if(arr[i]<in_min)in_min=arr[i];
        }
        int inside=0;
        if(in_max<0 && in_min<0){
            inside=in_min-in_max;
        }
        else{
            inside=in_max-in_min;
        }
        return (Math.max(inside,Math.max(max,in_max)));
        


        
    }
}
