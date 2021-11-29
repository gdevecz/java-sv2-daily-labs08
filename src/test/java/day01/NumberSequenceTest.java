package day01;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberSequenceTest {

    @Test
    void testCreateList() {
        NumberSequence ns = new NumberSequence(Arrays.asList(3, 5, 6));
        
        assertEquals(3,ns.numbers.size());
        assertEquals(3,ns.numbers.get(0));
        assertEquals(5,ns.numbers.get(1));
        assertEquals(6,ns.numbers.get(2));
    }

    @Test
    void testCreateRandom() {
        NumberSequence ns = new NumberSequence(4,2,4);

        assertEquals(4, ns.numbers.size());
    }

    @Test
    void closeToAverageTest() {
        NumberSequence ns = new NumberSequence(Arrays.asList(1,2, 4,5,6,8,9));

        assertEquals(Arrays.asList(4,5,6), ns.closeToAverage(1));
    }
}