package pl.mk.collections.binarytree;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleTreeTest {
    @Test
    public void createTree() {
        final SimpleTree<Integer> root = new SimpleTree<>(7, null, null);
        root.insert(3);
        root.insert(9);
        root.insert(10);
        assertTrue(root.search(10));
        assertEquals(Integer.valueOf(10),
                root.getRight().getRight().getValue());
    }
}