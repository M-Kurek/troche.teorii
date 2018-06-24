package pl.mk.collections;

import org.junit.Test;

import static org.junit.Assert.*;

public class AgainstAbstractTest {

    @Test
    public void testAdd() {
        AgainstAbstract container = new AgainstAbstract();

        container.treatAbstractAsInterface("abc");
        container.treatAbstractAsInterface("abcd");

        assertEquals("[abc, abcd]", container.getList().toString());
    }

}