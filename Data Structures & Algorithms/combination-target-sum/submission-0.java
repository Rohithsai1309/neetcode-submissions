class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
       List<List<Integer>> result=new ArrayList<>();
       help(nums,target,0,new ArrayList<>(),result);
       return result; 
    }
    public void help(int[] nums,int t,int ind,List<Integer> list
    ,List<List<Integer>> result)
    {
        if(t==0)
        {
            result.add(new ArrayList<>(list));
            return;
        }
        if(t<0)return;

        for(int i=ind;i<nums.length;i++){
            list.add(nums[i]);
            help(nums,t-nums[i],i,list,result);
            list.remove(list.size()-1);
        }
    }
}
