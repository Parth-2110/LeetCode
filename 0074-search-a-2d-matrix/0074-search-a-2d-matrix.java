class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix[0].length;
        int n = matrix.length;
        
        int left = 0;
        int right = (m*n) - 1;

        while(left <= right){

            int mid = left + (right - left)/2;

            int col = mid % m;
            int row = mid / m;

            if(matrix[row][col] == target){
                return true;
            }

            else if(matrix[row][col] < target){
                left = mid + 1;
            }

            else{
                right = mid - 1;
            }
        }


        return false;
    }
}