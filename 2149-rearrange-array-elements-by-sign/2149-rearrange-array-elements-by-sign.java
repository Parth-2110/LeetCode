class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] ans = new int[nums.length];
        int pos = 0;
        int neg = 1;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos += 2;
            }

            else{
                ans[neg] = nums[i];
                neg += 2;
            }
        }

        return ans;



        // List<Integer> list1 = new ArrayList<>();
        // List<Integer> list2 = new ArrayList<>();

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] > 0){
        //         list1.add(nums[i]);
        //     }

        //     else if(nums[i] < 0){
        //         list2.add(nums[i]);
        //     }
        // }
        
        // int j = 0;
        // int k = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(i % 2 == 0){
        //       nums[i] = list1.get(j++);
        //     }

        //     else if(i % 2 != 0){
        //         nums[i] = list2.get(k++);
        //     }

        // }

        // return nums;

        


    }
}