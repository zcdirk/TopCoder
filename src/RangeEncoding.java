/**
 * You are given a arr that contains a set of positive integers.
 * The elements in arr are all distinct and they are given in increasing order.
 *
 * A range is a finite set of consecutive integers.
 * Formally, for any two positive integers a ≤ b the range [a,b] is defined to be
 * the set of all integers that lie between a and b, inclusive.
 * For example, [3,3] = {3} and [4,7] = {4,5,6,7}.
 *
 * You want to represent the set given in arr as a union of some ranges. Return the minimum number of ranges you need.
 */
public class RangeEncoding {
    public int minRanges(int[] arr) {
        int res = 1, pre = arr[0], len = arr.length;
        for (int i = 1; i < len; i++) {
            if (arr[i] != pre + 1) res++;
            pre = arr[i];
        }
        return res;
    }
}
