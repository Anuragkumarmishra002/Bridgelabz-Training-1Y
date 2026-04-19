class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int primary = 0 ;
        int secondary =0 ;

        for( int i = 0 ; i < n ; i++ ){
            primary = primary + mat[i][i];
            secondary = secondary  + mat[i][n-1-i];

        }
        int result = primary + secondary ;
        if( n % 2 != 0 ){
            result = result - mat[n/2][n/2];
        }
        return result ;
    }
}