/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
    if (!prices || prices.length < 2) return 0;

    let min = Infinity;
    let max = 0;

    for (let price of prices) {
        if (price < min) {
            min = price;
        } else if (price - min > max) {
            max = price - min;
        }
    }
    return max;
};
