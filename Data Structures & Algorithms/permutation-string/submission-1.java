class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] main=s1.toCharArray();
        Arrays.sort(main);
        int start=0;
        int end=s1.length();
        while(end<=s2.length()){
            char[] sub=s2.substring(start,end).toCharArray();
            Arrays.sort(sub);
            if(Arrays.equals(main,sub))return true;
            start++;
            end++;
        }
        return false;

    }
}
