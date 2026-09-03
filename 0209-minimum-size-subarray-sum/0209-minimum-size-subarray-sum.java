class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int low = 0;
        int high = 0;
        int res =  Integer.MAX_VALUE;
        int sum = 0;
        while(high<arr.length){
            sum  = sum + arr[high];
            
            while(sum >= target){
                int len = high - low + 1;
                if(res > len){
                    res = len;
                }
                sum = sum - arr[low];
                low++;
            }
            high++;
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}