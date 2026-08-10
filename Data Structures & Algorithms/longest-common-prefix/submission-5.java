class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        int fLength=strs[0].length();
        char[] ans=new char[fLength];
        for(int i=0;i<strs[0].length();i++){
            ans[i]=strs[0].charAt(i);
        }
        for(int i=1;i<strs.length;i++){
            ans=compare(ans,strs[i]);
            if(ans.length==0)return "";
        }
        String fans="";
        
    return new String(ans);
    }
    public char[] compare(char[] c,String s){
        int end=0;
        int lower=c.length<s.length()?c.length:s.length();
        for(int i=0;i<lower;i++){
            if(c[i]==s.charAt(i)){
                end++;
            }
            else{end=i;break;}
        }
        char[] main=new char[end];
        if(end==0)return new char[]{};
        main=Arrays.copyOfRange(c,0,end);
    return main;
    }
}