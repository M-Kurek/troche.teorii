package pl.mk.threads.immutable;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImmutableRGBTest {

    @Test
    public void testGetRGB() {
        ImmutableRGB rgb = new ImmutableRGB(1,1,1,"cos");
        assertEquals(Math.pow(2, 16) + Math.pow(2, 8) + 1, rgb.getRGB(), 1);
        assertEquals(Math.pow(2, 8) + 1, rgb.getRGB() >> 8, 1);
        assertEquals(1, rgb.getRGB() >> 8 >> 8);
        assertEquals(Math.pow(2, 16), rgb.getRGB() - (rgb.getRGB() >> 8), 1);
    }
}