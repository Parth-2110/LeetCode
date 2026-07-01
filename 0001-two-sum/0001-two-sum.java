class Solution {
    public int[] twoSum(int[] nums, int target) {

        // int[] arr = new int[2];

    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i = 0; i < nums.length; i++){

        int complement = target - nums[i];

        if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
        }

        map.put(nums[i],i);
    }

    return new int[]{-1,-1};

    //   for(int i = 0; i < nums.length - 1; i++){
    //     for(int j = i + 1; j < nums.length; j++){

    //         int sum = nums[i] + nums[j];

    //         if(sum == target){
    //         arr[0] = i;
    //         arr[1] = j;
    //         }

    //         else{
    //             sum -= nums[j];
    //         }
    //     }
    //   }

    //   return arr;
    }
}