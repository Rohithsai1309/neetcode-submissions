class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lis=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        Collections.sort(list);
                        if(!lis.contains(list)){
                            lis.add(list);
                        }
                        
                    }
                }
            }
        }
        return lis;
    }
}
