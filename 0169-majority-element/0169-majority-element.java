class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int counter = map.getOrDefault(n, 0) + 1;
            map.put(n, counter);

            if(counter > (nums.length/2)){
                return n;
            }
        }

        return 0;
    }
}