package pl.mk.collections;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ListVaria {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetAfterNotUsedIndex() {
        List<String> items = new ArrayList<>(3);

        assertEquals(0, items.size());
        items.set(1, "a");

        fail("cannot SET next without previous");
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAfterNotUsedIndex() {
        List<String> items = new ArrayList<>(3);

        assertEquals(0, items.size());
        items.add(1, "a");

        fail("cannot ADD next without previous");
    }

}
