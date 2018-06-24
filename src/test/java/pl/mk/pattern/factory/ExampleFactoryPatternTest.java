package pl.mk.pattern.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleFactoryPatternTest {

    @Test
    public void testCreateEbay() throws Exception {
        CrunchifyCompany obj = ExampleFactoryPattern.createInstanceByName("Ebay");
        assertNotNull(obj);
        assertTrue(obj instanceof CrunchifyEbay);
        assertEquals("CrunchifyEbay", obj.toString());
    }
}