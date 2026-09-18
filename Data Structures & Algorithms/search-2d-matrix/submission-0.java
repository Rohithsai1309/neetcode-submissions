class Solution {
    public boolean searchMatrix(int[][] matrix, int t) {
        int rSt=0;
        int rEnd=matrix.length-1;
        int cSt=0;
        int cEnd=matrix[0].length-1;
        int searchableRow=matrix.length-1;
        for(int i=0;i<=rEnd;i++){
            if(matrix[i][0]<=t && matrix[i][matrix[0].length-1]>=t){
                searchableRow=i;
            }
        }
        return binSearch(matrix[searchableRow],t);
    }

    public boolean binSearch(int[] arr,int t){
        int st=0,end=arr.length-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(arr[mid]==t)return true;
            else if(arr[mid]<t)st=mid+1;
            else end=mid-1;
        }
    return false;
    }
}
