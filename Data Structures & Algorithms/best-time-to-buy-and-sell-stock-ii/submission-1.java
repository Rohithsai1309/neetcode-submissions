class Solution {
    public int maxProfit(int[] prices) {
        int prev=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>=prev){
            profit+=(prices[i]-prev);
            prev=prices[i];
            }
            else{
                prev=(prices[i]<prev?prices[i]:prev);
            }
        }
        return profit;
    }
}