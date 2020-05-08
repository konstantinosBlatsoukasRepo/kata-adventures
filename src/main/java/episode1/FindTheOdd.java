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

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindTheOdd {

    public int solve(int[] input) {
        Map<Integer, Integer> integersFrequencies = getIntegersFrequencies(input);

        return getTheIntegerWithOddFrequency(integersFrequencies);
    }

    private int getTheIntegerWithOddFrequency(Map<Integer, Integer> integersFrequencies) {
        List<Entry<Integer, Integer>> integerWithOddFrequencies = integersFrequencies.entrySet()
            .stream()
            .filter(v -> isOdd(v.getValue()))
            .collect(Collectors.toList());

        return integerWithOddFrequencies.get(0).getKey();
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

    private Map<Integer, Integer> getIntegersFrequencies(int[] input) {
        Map<Integer, Integer> integersFrequencies = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int currentValue = input[i];

            if (integersFrequencies.containsKey(currentValue)) {
                integersFrequencies.computeIfPresent(currentValue, (k, v) -> v + 1);
            } else {
                integersFrequencies.computeIfAbsent(currentValue, v -> 1);
            }
        }
        return integersFrequencies;
    }
}