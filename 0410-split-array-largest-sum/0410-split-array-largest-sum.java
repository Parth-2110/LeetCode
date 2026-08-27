class Solution {
    public int splitArray(int[] nums, int k) {
        
        int left = Integer.MIN_VALUE;
        for(int num: nums){
            left = Math.max(left,num);
        }

        int right = 0;
        for(int num: nums){
            right += num;
        }

            int ans = 0;
            
        while(left <= right){
            int mid = left + (right- left)/2;

            if(isItPossible(nums,k,mid)){
                right = mid - 1;
                ans = mid;
            }

            else{
                left = mid + 1;
            }

        }

        return ans;
    }


    public boolean isItPossible(int[] nums, int k, int mid){

        int sum = 0;
        int splits = 1;

        for(int num: nums){

            if(sum + num > mid){
                splits++;
                sum = num;
            }

            else{
                sum += num;
            }
    
    
        }

        return splits <= k;
    }

}