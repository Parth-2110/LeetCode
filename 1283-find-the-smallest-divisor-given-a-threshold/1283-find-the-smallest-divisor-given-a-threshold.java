class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        
        int left = 1;
        int right = Integer.MIN_VALUE;
        for(int num: nums)
      right = Math.max(num,right);

        int ans = -1;

        while(left <= right){

            int mid = left + (right - left)/2;

            if(canThisMidBeAns(nums,threshold,mid)){
                right = mid - 1;
                ans = mid;
            }

            else{
                left = mid + 1;
            }
        }

        return ans;
    }

    public boolean canThisMidBeAns(int[] nums, int threshold,int mid){

        

        int sum = 0;
        for(int num: nums){
             int ans = num/mid;
            
            if(num % mid != 0){
                ans++;
            }

            sum += ans;
         }

      

        if(sum <= threshold){
            return true;
        }

        return false;
    }
}