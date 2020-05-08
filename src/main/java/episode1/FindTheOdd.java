package episode1;
/*
the following problem was copied from codewars.com (level 6)

kata name: Find the odd int

The problem :

    Given an array, find the integer that appears an odd number of times.
    There will always be only one integer that appears an odd number of times.

Input: an array of ints

Output: an int
*/

import java.util.Arrays;

public class FindTheOdd {
    public int solve(int[] input) {
        return Arrays.stream(input).reduce(0, (x, y) -> x ^ y);
    }
}