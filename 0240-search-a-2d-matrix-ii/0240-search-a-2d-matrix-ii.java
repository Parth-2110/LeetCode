class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        for(int i = 0; i < matrix.length; i++){

            if(ifFound(matrix[i], target)){
                return true;
            }

        }
        return false;
    }

    public boolean ifFound(int[] row, int target){
        int left = 0;
        int right = row.length - 1;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(row[mid] == target){
                return true;
            }

            else if(row[mid] > target){
                right = mid - 1;
            }

            else{
                left = mid + 1;
            }
        }
        return false;

    }
}