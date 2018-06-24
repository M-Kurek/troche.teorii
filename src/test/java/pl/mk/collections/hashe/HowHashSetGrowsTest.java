package pl.mk.collections.hashe;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class HowHashSetGrowsTest {
    @Test
    public void testChangeInSet_problemsWhenMutableInside() {
        Set<StringBuffer> secik = new HashSet<>(8);
        secik.add(new StringBuffer("a"));
        secik.add(new StringBuffer("b"));

        StringBuffer underChange = secik.iterator().next();
        assertTrue(secik.contains(underChange));

        StringBuffer item = new StringBuffer(underChange);

        underChange = underChange.append(" ");
        assertTrue(secik.contains(underChange));

        underChange = item;
        assertFalse("po zmianie referencji nie moze byc znaleziony", secik.contains(underChange));
        assertFalse("nigdy nie dodano", secik.contains(item));
    }
}