class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        if (length < 3)
            return length;
        int j = 2;
        for (int i = 2; i < length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
