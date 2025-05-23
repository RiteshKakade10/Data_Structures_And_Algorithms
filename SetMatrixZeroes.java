class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        Set<Integer> rowSet=new HashSet<>();
        Set<Integer> colSet=new HashSet<>();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        //inserting zeros
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(rowSet.contains(i)||colSet.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }

    }
}
