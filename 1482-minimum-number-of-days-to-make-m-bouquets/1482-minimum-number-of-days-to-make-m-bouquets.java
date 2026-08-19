class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        if(bloomDay.length < ((long)m*k)){
            return -1;
        }

        int ans = -1;
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;

        for(int bloom: bloomDay){

           start = Math.min(bloom,start);
           end = Math.max(bloom,end);
            
        }
        
        while(end >= start){

            int mid = start + (end - start)/2;

            if(canWeMakeBouquet(bloomDay, m , k , mid)){
                end = mid - 1;
                ans = mid;
            }

            else{
                start = mid + 1;
            }
        }

        return ans;
    }

    public boolean canWeMakeBouquet(int[] bloomDay, int m, int k, int mid){

        int flowers = 0;
        int bouquet = 0;
        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= mid){
                flowers++;

                if(flowers == k){
                bouquet++;
                flowers = 0;
            }


            }

            else{
                flowers = 0;
            }

            
            if(bouquet == m){
                return true;
            }

            
        }
        return false;
    }
}