class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int boats=0;
        while(i<=j){
            int curr=people[i]+people[j];
            if(curr>limit){
                boats++;
                j--;
            }
            if(curr<=limit){
                boats++;
                i++;
                j--;
            }
        }
    return boats;
    }
}