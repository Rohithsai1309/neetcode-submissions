class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:nums){
            if(arr.contains(i))return true;
            arr.add(i);
        }
        return false;
    }
}