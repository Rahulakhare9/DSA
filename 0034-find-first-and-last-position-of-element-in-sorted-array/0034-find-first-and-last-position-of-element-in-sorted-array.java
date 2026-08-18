class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0 ;
        int high = nums.length-1;
        int lidx = -1;
        int hidx =-1;

//
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] < target){
              low = mid + 1;
            } else if (nums[mid] > target){
              high = mid-1;
            } else {
                lidx = mid;
                high = mid - 1;
            }
        }

        low = 0 ;
        high = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] < target){
              low = mid + 1;
            } else if(nums[mid] > target){
              high = mid-1;
            } else {
                hidx = mid;
                low = mid + 1;
            }
        }

        int[] arr = {lidx,hidx};
        return arr;
    }
}