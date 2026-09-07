class Solution {
    public int maxProduct(int[] nums) {

        int maxProd = Integer.MIN_VALUE;

        if(nums.length <= 1) return nums[0];

        for (int n : nums) {
            maxProd = Math.max(maxProd, n);
        }
       

        for(int i = 0; i < nums.length; i++){

             int prod = nums[i];
            for(int j = i + 1;j < nums.length; j++){

                

               
               prod *= nums[j];
                

                maxProd = Math.max(prod,maxProd);

            }
        }        

return maxProd;
        
    }
}