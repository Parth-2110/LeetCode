class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = 1000000000;
      
        while(end >= start){
            int mid = start + (end - start)/2;
            

            if(canKokoEatBanana(piles,mid,h)) end = mid - 1;

            else{
                start = mid + 1;
            }

          
        }
        return start;
    }

    public boolean canKokoEatBanana(int[] piles, int k , int h){

        long hours = 0;

        for(int pile: piles){

            int div = pile/k;
            hours = hours + div;
            if(pile % k != 0) hours++;


        }

        return hours <= h;
    }
}