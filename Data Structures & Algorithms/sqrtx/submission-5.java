class Solution {
    public int mySqrt(int x) {
        if(x<2)return x;
        int st=1,end=x/2;
        int ans=1;
        while(st<=end){
            long mid=st+(end-st)/2;
            long curr=mid*mid;
            if(curr==x)return (int) mid;
            else if(curr>x){end=(int) mid-1;}
            else{
                ans=(int) mid;
                st=(int) mid+1;
            }
        }
    return ans;
    }
}