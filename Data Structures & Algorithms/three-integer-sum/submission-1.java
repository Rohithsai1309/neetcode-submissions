class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        int n=nums.length-1;
        while(i<n-1){
            if(i>0 && nums[i]==nums[i-1]){
                i++;
                continue;
            }
            int j=i+1,k=n;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    List<Integer> temp=new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    list.add(temp);
                    while(j<k && nums[j+1]==nums[j])j++;
                    while(j<k && nums[k-1]==nums[k])k--;
                }
                if(nums[j]+nums[k]>-1*nums[i])k--;
                else j++;
            }
            i++;
        }
    return list;
    }
}
