class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int end=0;
        HashSet<Integer> set=new HashSet<>();
        while(end<nums.length){
            if(set.size()>k){
                set.remove(nums[end-k-1]);
            }
            if(set.contains(nums[end])){
                return true;
            }
            set.add(nums[end]);
            // System.out.println(set.toString()+" curr: "+nums[end]+" end: "+end);
            end++;
        }
    return false;
    }
}