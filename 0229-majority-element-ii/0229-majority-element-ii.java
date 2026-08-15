class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int n : nums) {
            int count = map.getOrDefault(n, 0) + 1;
            map.put(n, count);

            if (count > nums.length / 3 && !result.contains(n)) {
                result.add(n);
            }
        }

        return result;
    }
}