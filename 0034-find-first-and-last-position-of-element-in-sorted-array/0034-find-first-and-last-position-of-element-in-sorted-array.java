class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first = findFirst(nums,target);
        int last = findLast(nums,target);

        return new int[]{first,last};
    }

    
public int findFirst(int[] nums, int target){

    int n = nums.length;
    int start = 0;
    int end = n - 1;
    int ans = -1;

    while(start <= end){

        int mid = (start + end)/2;

        if(nums[mid] == target){
            ans = mid;
            end = mid - 1;
        }

        else if(nums[mid] > target){

            end = mid - 1;

        }

        else{
            start = mid + 1;
        }
    }

    return ans;
}

public int findLast(int[] nums, int target){

    int n = nums.length;
    int start = 0;
    int end = n - 1;
    int ans = -1;

    while(start <= end){

        int mid = (start + end)/2;

        if(nums[mid] == target){
            ans = mid;
            start = mid + 1;
        }

        else if(nums[mid] > target){

            end = mid - 1;

        }

        else{
            start = mid + 1;
        }
    }

    return ans;
}

}
