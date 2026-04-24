class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        int max=1;
        for(int i=0;i<s.length();i++){
            StringBuffer str=new StringBuffer();
            str.append(s.charAt(i));
            for(int j=i+1;j<s.length();j++){
                if(str.toString().contains(s.charAt(j)+"")){
                    max=Math.max(max,str.length());
                    break;
                }
                str.append(s.charAt(j));
                max=Math.max(max,str.length());
            }
        }
        return max;
    }
}
