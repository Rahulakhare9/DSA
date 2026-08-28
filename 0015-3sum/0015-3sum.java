
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 1. Return type must match List<List<Integer>>
        List<List<Integer>> result = new ArrayList<>();
        
        // 2. MUST sort the array for the two-pointer approach to work
        Arrays.sort(nums);
       
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element (nums[i])
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;
            int target = -1 * nums[i];

            while (left < right) {
                int sum = nums[left] + nums[right];
                
                if (sum == target) {
                    // 3. Create a triplet list and append it to the main result list
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    left++;
                    right--;
                    
                    // Skip duplicates for the second element
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    // Skip duplicates for the third element
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    } 
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}