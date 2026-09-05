class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        List<Integer> list = new ArrayList<>();

        int left = 0;
        int right = 0;

        while(left < m && right < n){

            if(nums1[left] < nums2[right]){
                list.add(nums1[left]);
                 left++;
            }

            else{
                list.add(nums2[right]);
            right++;
            }          
            
        }

        if(left < m){
            for(int i = left; i < m; i++){
                list.add(nums1[i]);
            }
        }

        if(right < n){
            for(int i = right; i < n; i++){
                list.add(nums2[i]);
            }
        }

        int k = 0;
        for(int i : list){
            nums1[k++] = i;
        }
        
    }
}