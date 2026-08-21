class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int first=0;
        int second=1;
        int count1=0,count2=0;
        for(int i:nums){
            if(i==first)count1++;
            else if(i==second)count2++;
            else if(count1==0){count1++;first=i;}
            else if(count2==0){count2++;second=i;}
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> list=new ArrayList<>();
        int c1=0,c2=0;
        for(int i:nums){
            if(i==first)c1++;
            else if(i==second)c2++;
        }
        
        if(c1>nums.length/3)list.add(first);
        if(c2>nums.length/3)list.add(second);
    return list;
    }
}