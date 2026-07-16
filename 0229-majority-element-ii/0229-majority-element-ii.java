class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int m = nums.length/3;

        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>(); 

        for(int i = 0; i < nums.length; i++){

            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);


           
                if(map.get(nums[i]) > m){
                    set.add(nums[i]);
                }
            
            
        }

        for(Integer i : set){
            list.add(i);
        }
        return list;
    }
}