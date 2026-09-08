class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int position=arr.length-1,left=0,right=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>x){
                position=i-1;
                break;
            }
        }
        left=position;
        right=position+1;
        List<Integer> res=new ArrayList<>();
        while((left>=0 || right<=arr.length-1) && k>0){
            if(left>=0 && right<=arr.length-1){
                if(Math.abs(x-arr[left])>Math.abs(arr[right]-x)){
                    res.add(arr[right++]);
                }
                else{
                    res.add(arr[left--]);
                }
            }
            else if(left>=0){
                res.add(arr[left--]);
            }
            else{
                res.add(arr[right++]);
            }
            k--;
        }
    Collections.sort(res);
    return res;
    }
}