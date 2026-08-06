class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
    
        if((long)m * k > bloomDay.length){
            return -1;
        }

       
            int left = Integer.MAX_VALUE;
            int right = Integer.MIN_VALUE; 
            int ans = -1;

            for(int day : bloomDay){
                left = Math.min(left,day);
                right = Math.max(right,day);
            }

        while(left <= right){

            int mid = left + (right - left)/2;

            if(canWeMakeBouquets(bloomDay,m,k,mid)) {
                right = mid - 1 ;
                ans = mid;
            }
            else{
                left = mid + 1;
            }
        }

        return ans;
    }

    public boolean canWeMakeBouquets(int[] bloomDay, int m, int k, int days)
{
            int bouqet = 0;
            int flowers = 0;
           

   for(int i = 0; i < bloomDay.length; i++){
    
    if(bloomDay[i] <= days){
         flowers++;

         if(flowers == k){
            bouqet++;
            flowers = 0;
         }
}
         

        else{
            flowers = 0;
        }
         
   

   if(bouqet == m){
    return true;
   }

   
}
return false;
}
}