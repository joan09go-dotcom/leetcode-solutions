class Solution {
    public int[] sortArray(int[] nums) {
        
        if (nums == null || nums.length < 2) {
            return nums;
        }

        int mid = nums.length / 2;
        int[] l = new int[mid];
        int[] r = new int[nums.length - mid];

        
        for (int i = 0; i < mid; i++) {
            l[i] = nums[i];
        }
        for (int i = mid; i < nums.length; i++) {
            r[i - mid] = nums[i];
        }

        
        sortArray(l);
        sortArray(r);

        merge(nums, l, r);

        return nums;
    }

    
    private void merge(int[] nums, int[] l, int[] r) {
        int i = 0; 
        int j = 0; 
        int k = 0; 

        while (i < l.length && j < r.length) {
            if (l[i] <= r[j]) {
                nums[k++] = l[i++];
            } else {
                nums[k++] = r[j++];
            }
        }

        while (i < l.length) {
            nums[k++] = l[i++];
        }

        while (j < r.length) {
            nums[k++] = r[j++];
        }
    }
}