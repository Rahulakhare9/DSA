class Solution {
    public int search(int[] arr, int target) {
        
        int low = 0;
        int high = arr.length-1;
        int idx = -1;
        while(low <= high){
           int mid = (low+high)/2;
           if(target > arr[mid]){
             low = mid+1;
           } else if(target < arr[mid]){
             high = mid-1;
           } else if(arr[mid] == target){
             idx = mid;
            high = mid-1;
           }
        }

        return idx;
    }
}