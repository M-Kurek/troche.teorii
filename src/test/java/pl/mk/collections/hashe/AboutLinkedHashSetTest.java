package pl.mk.collections.hashe;

import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

@Ignore /*bledy ?*/
public class AboutLinkedHashSetTest {

    @Test
    public void compareIterators() {
        List<String> list = Arrays.asList("z,a,b,x,c".split(","));

        TreeSet<String> tree = new TreeSet<>(list);

        LinkedHashSet<String> linkedHash = new LinkedHashSet<String>(list);

        Iterator<String> treeItr = tree.iterator();
        Iterator<String> linkedHashItr = linkedHash.iterator();
        while (treeItr.hasNext() && linkedHashItr.hasNext()) {
            String treeItem = treeItr.next();
            String linkedItem = linkedHashItr.next();
            assertNotEquals(treeItem, linkedItem);
        }

    }

        @Test
    public void copyAll() {
        Set<String> startSet = new HashSet<>();
        startSet.add("a");
        startSet.add("j");

        Set<String> copy = new LinkedHashSet(startSet);
        assertEquals("[a, j]", copy.toString());

        startSet.add("b");
        copy = new LinkedHashSet(startSet);
        assertEquals("[b, a, j]", copy.toString());

        startSet.add("c");
        copy = new LinkedHashSet(startSet);
        assertEquals("[b, c, a, j]", copy.toString());
    }

    @Test
    public void copyAll2() {
        Set<String> startSet = new HashSet<>();
        startSet.add("a");
        startSet.add("j");

        startSet.add("b");
        startSet.add("d");
        Set<String> copy = new LinkedHashSet(startSet);
        assertEquals("[d, b, a, j]", copy.toString());
    }

    @Test
    public void copyAllOrderRemains() {
        Set<String> startSet = new LinkedHashSet<>();
        startSet.add("a");
        startSet.add("j");

        startSet.add("b");
        startSet.add("d");
        Set<String> copy = new LinkedHashSet(startSet);
        assertEquals("[a, j, b, d]", copy.toString());
    }

}