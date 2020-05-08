package episode1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindTheOddTest {

    @Test
    public void findTheOddTests() {
        FindTheOdd findTheOdd = new FindTheOdd();
        
        assertEquals(5, findTheOdd.solve(new int[] { 20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5 }));
        assertEquals(-1, findTheOdd.solve(new int[] { 1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5 }));
        assertEquals(5, findTheOdd.solve(new int[] { 20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5 }));
        assertEquals(10, findTheOdd.solve(new int[] { 10 }));
        assertEquals(10, findTheOdd.solve(new int[] { 1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1 }));
        assertEquals(1, findTheOdd.solve(new int[] { 5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10 }));
    }

}