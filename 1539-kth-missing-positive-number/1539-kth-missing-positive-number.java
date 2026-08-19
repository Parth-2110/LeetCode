class Solution {
    public int findKthPositive(int[] arr, int k) {

        HashSet<Integer> set = new HashSet<>();
        List<Integer> al = new ArrayList<>();

        
        int right = arr[arr.length - 1];

      

        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }

        int count = 0;
        for(int i = 1; ; i++){
            if(!set.contains(i)){
               count++;

               if(count == k){
                return i;
               }
            }

           
        }

       

      
        
    }
}