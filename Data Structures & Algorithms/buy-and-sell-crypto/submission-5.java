class Solution {
    public int maxProfit(int[] prices) {
    int max=0;
    int currmin=Integer.MAX_VALUE;

    for(int i:prices){
        max=Math.max(max,i-currmin);
        currmin=Math.min(currmin,i);
    }
    return max;
    }
}
