package pl.mk.algo;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TheFibonacciTest {

    @Test
    public void testFibs() {
        TheFibonacci fibonacci = new TheFibonacci();
        assertEquals(Arrays.asList(0, 1, 1, 2, 3), fibonacci.fillFibonacci(4));
        assertEquals(Arrays.asList(0, 1, 1, 2, 3, 5), fibonacci.fillFibonacci(5));
    }
}