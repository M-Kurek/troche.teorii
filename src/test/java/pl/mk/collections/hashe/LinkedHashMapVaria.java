package pl.mk.collections.hashe;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class LinkedHashMapVaria {

    @Test
    public void foo() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("a", "0");
        Set<Map.Entry<String, String>> inSet = map.entrySet();
        assertFalse(inSet.contains("a"));
    }
}
