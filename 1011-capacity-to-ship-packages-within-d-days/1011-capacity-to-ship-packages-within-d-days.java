class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = Integer.MIN_VALUE;
        int ans = 0;

        for(int num: weights){
            left = Math.max(num,left);
        }

        int right = 0;
        for(int num: weights)
        right += num;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(canWeDoTask(weights, days, mid)){
                right = mid - 1;
                ans = mid;
            }

            else{
                left = mid + 1;
            }

        }
        
        return ans;
    }


    public boolean canWeDoTask(int[] weights, int days, int capacity){

       int day = 1;

        int sum = 0;
       for(int num: weights){
        
       

        if((sum + num) > capacity){
            day++;
            sum = num;
        }
            else
         sum += num;
       }

       if(day <= days)
       return true;

       return false;
    
    }
}