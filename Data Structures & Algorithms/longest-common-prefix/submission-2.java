class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        for(char c:strs[0].toCharArray()){
            sb.append(c);
        }
        for(String s:strs){
            if(s.length()==0)return "";
            for(char c=0;c<s.length();c++){
                if(c<sb.length() && s.charAt(c)!=sb.charAt(c)){
                    sb.delete(c,sb.length());  
                    break;
                }
                
            }
            if (s.length() < sb.length()) {
                sb.delete(s.length(), sb.length());
            }
        }
    return sb.toString();
    }
}