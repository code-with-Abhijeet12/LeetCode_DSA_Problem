class Solution {
     public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // if complement already exists, return index
            if(map.containsKey(complement)) {
                return new int[]{ map.get(complement), i };
            }
            
            // store the value with its index
            map.put(nums[i], i);
        }
        
        return new int[]{}; // not found
    }
}