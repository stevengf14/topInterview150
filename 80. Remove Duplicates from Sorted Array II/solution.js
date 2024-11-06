/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
    var length = nums.length;
    if (length < 3)
        return length;
    var j = 2;
    for (let i = 2; i < length; i++) {
        if (nums[i] != nums[j - 2]) {
            nums[j] = nums[i];
            j++;
        }
    }
    return j;
};
