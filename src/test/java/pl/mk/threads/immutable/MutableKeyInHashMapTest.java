package pl.mk.threads.immutable;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MutableKeyInHashMapTest {

    @Test
    public void testChangedKey() {
        Map<MutableKeyInHashMap, String> map = new HashMap<>();

        MutableKeyInHashMap key = new MutableKeyInHashMap();
        key.setLat(1);
        key.setLon(1);

        map.put(key, "a");
        assertTrue(map.containsKey(key));
        assertEquals("a", map.get(key));

        map.keySet().iterator().next().setLat(10);

        assertFalse(map.containsKey(key));
        assertEquals(null, map.get(key));

    }

}