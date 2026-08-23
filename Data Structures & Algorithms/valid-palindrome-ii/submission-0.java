class Solution {
    public boolean validPalindrome(String s) {
        int st=0;
        int end=s.length()-1;
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                return pal(s,st+1,end) || pal(s,st,end-1);
            }
            st++;
            end--;
        }
        return true;
    }
    public boolean pal(String s,int st,int ed){
        while(st<ed){
            if(s.charAt(st)!=s.charAt(ed))return false;
            st++;ed--;
        }
    return true;
    }
}