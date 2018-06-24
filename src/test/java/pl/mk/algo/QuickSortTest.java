package pl.mk.algo;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void testSome() {
        assertEquals(Arrays.asList(1,2,3,5), QuickSort.sort(Arrays.asList(5,3,2,1)));
        assertEquals(Arrays.asList(1,1,2,3,4,5), QuickSort.sort(Arrays.asList(1,5,4,3,2,1)));
    }
    @Test
    public void testSmall() {
        assertEquals(Arrays.asList(1), QuickSort.sort(Arrays.asList(1)));
        assertThat(QuickSort.sort(Arrays.asList(2, 1)), Matchers.contains(1, 2));
        assertEquals(Arrays.asList(1,2), QuickSort.sort(Arrays.asList(1,2)));
    }
    @Test
    public void testWhitDuplicates() {
        assertThat(QuickSort.sort(Arrays.asList(2, 2, 1, 3, 4, 5, 0)), Matchers.contains(0, 1, 2, 2, 3, 4, 5));
    }
}