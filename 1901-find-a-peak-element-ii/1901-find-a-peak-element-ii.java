class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int m = mat[0].length;
        int n = mat.length;

        int left = 0; 
        int right = m - 1;

        int maxRow = 0;

        while(left <= right){
            int mid = left + (right - left)/2;

                for(int i = 0; i < n; i++){
            if(mat[maxRow][mid] < mat[i][mid]){
                maxRow = i;
            }
        }

            if((mid == 0 || mat[maxRow][mid] > mat[maxRow][mid - 1]) 
            && (mid == m - 1 || mat[maxRow][mid] > mat[maxRow][mid + 1])){
                return new int[] {maxRow,mid};
            }

            else if(mat[maxRow][mid] < mat[maxRow][mid - 1]){
                right = mid - 1;
            }

            else{
                left = mid + 1;
            }
            
            
        }

        return new int[] {-1,-1};
        
    }
}