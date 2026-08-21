class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            Set<Character> set1=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                if(set1.contains(board[i][j]))return false;
                else set1.add(board[i][j]);
            }
            Set<Character> set2=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.')continue;
                if(set2.contains(board[j][i]))return false;
                else set2.add(board[j][i]);
            }
        }
        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                Set<Character> set=new HashSet<>();
                for(int x=i;x<i+3;x++){
                    for(int y=j;y<j+3;y++){
                        if(board[x][y]=='.')continue;
                        if(!set.add(board[x][y]))return false;
                    }
                }
            }
        }
    return true;
    }
}
