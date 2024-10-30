/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
    const length = nums.length;
    if (length == 0)
        return 0;
    var k = 1;
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] != nums[k - 1]) {
            nums[k] = nums[i];
            k++;
        }
    }
    return k;
};
