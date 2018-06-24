package pl.mk.charset;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharsetUtilTest {
    @Test
    public void testAscii() throws Exception {
        assertEquals(0, CharsetUtil.findBanned("US-ASCII", "abc").size());
    }
    @Test
    public void testNotAscii() throws Exception {
        assertEquals(1, CharsetUtil.findBanned("US-ASCII", "abc\u00C0").size());
    }

    /**
     * pass z IntelliJ, nie z mvn 3.3.3 /
     * Java version: 1.8.0_172, vendor: Oracle Corporation
     * Java home: c:\progs\pure\jdk1.8.0_172\jre
     * Default locale: pl_PL, platform encoding: Cp1250
     * OS name: "windows 10", version: "10.0", arch: "amd64", family: "dos"
     */
    @Test
    public void testLatin1_canBeProblem() throws Exception {
        assertEquals(0, CharsetUtil.findBanned("ISO_8859-1", "abc¥").size());
    }
}