class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = 0;
        int right = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr =  new int[n1 + n2];

        int k = 0;
        while((left < n1) && (right < n2)){

            if(nums1[left] < nums2[right]){
                arr[k] = nums1[left];
                left++;
            }

            else{
                arr[k] = nums2[right];
                right++;
            }

            k++;
        }

        
        if(left < n1){
            for(int i = left; i < n1; i++){
                arr[k] = nums1[i];
                k++;
            }
        }

        else if(right < n2){
            for(int i = right; i < n2; i++){
                arr[k] = nums2[i];

                k++;
            }
        }

        int n = arr.length;
        
        if(n % 2 == 0){
           double mid = (double) (arr[(n/2) - 1] + arr[n/2])/2.0;
            return mid;
           
        }

        else{
            double mid = (double)arr[n/2];
            return mid;
        }
      

       
    }
}