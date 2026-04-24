class Solution {
    public boolean isAnagram(String sh, String t) {
        char[] f=sh.toCharArray();
        char[] s=t.toCharArray();
        Arrays.sort(f);
        Arrays.sort(s);
        if(f.length!=s.length)return false;
        for(int i=0;i<f.length;i++){
            if(f[i]!=s[i])return false;
        }
        
        return true;
    }
}
