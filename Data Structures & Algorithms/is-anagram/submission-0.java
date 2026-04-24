class Solution {
    public boolean isAnagram(String s, String t) {
        int[] one=new int[26];
        int[] two=new int[26];
        for(char c:s.toCharArray()){
            int place=c-'a';
            int x=one[place];
            one[place]=x+1;
        }
        for(char c:t.toCharArray()){
            int place=c-'a';
            int x=two[place];
            two[place]=x+1;
        }
        for(int i=0;i<26;i++){
            if(one[i]!=two[i])return false;
        }
        return true;
    }
}
