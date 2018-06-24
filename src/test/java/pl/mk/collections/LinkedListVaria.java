package pl.mk.collections;

import org.hamcrest.Matchers;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import static org.junit.Assert.*;

public class LinkedListVaria {

    @Test
    public void testDuplicateOrder() throws Exception {
        List<String> srcList = new LinkedList<String>();
        srcList.add("abc");
        srcList.add("def");
        srcList.add("a-last");

        List<String> targetList = new LinkedList<String>(srcList);
        assertThat(targetList, Matchers.contains("abc", "def", "a-last"));

        //!!! TODO dlaczego
        assertEquals("jak to", srcList, targetList);
        assertTrue("jak to", srcList.hashCode() == targetList.hashCode());
    }
}
