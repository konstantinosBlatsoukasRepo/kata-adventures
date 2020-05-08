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
import java.util.Map;
import java.util.Map.Entry;

public class FindTheOdd {
 
    public int solve(int[] input) {
        Map<Integer, Integer> integersFrequencies = getIntegersFrequencies(input);
        
        return getTheIntegerWithOddFrequency(integersFrequencies);
    }

    private int getTheIntegerWithOddFrequency(Map<Integer, Integer> integersFrequencies) {
        for (Entry<Integer, Integer> entry : integersFrequencies.entrySet()) {
            int currentFrequency = entry.getValue();
            if (isOdd(currentFrequency)) {
                return entry.getKey();
            }
        }      
        return 0;
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }

    private Map<Integer, Integer> getIntegersFrequencies(int[] input) {
        Map<Integer, Integer> integersFrequencies = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            int currentValue = input[i];

            if (integersFrequencies.containsKey(currentValue)) {
                int oldFrequency = integersFrequencies.get(currentValue);
                int newFrequency = oldFrequency + 1;
                integersFrequencies.put(currentValue, newFrequency);
            } else {
                integersFrequencies.put(currentValue, 1);
            }
        }
        return integersFrequencies;
    } 
} 