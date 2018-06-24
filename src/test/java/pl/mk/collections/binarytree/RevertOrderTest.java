package pl.mk.collections.binarytree;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RevertOrderTest {

    RevertOrder tool;

    @Before
    public void reset() {
        tool = new RevertOrder();
    }

    @Test
    public void testRevertWords() {
        String text = "abc bcd def";
        assertEquals("[def, bcd, abc]", Arrays.asList(tool.tokenize(text)).toString());
    }
    @Test
    public void testRevertSentence() {
        String text = "abc, bcd. def.";
        assertEquals("[def, bcd, abc]", Arrays.asList(tool.tokenize(text)).toString());
    }
    @Test
    public void testRevertParagraph() {
        String text = "abc, bcd|\r def!\r\nfgh?";
        assertEquals("[fgh, def, bcd, abc]", Arrays.asList(tool.tokenize(text)).toString());
    }
    @Test
    public void testRevertMathText() {
        String text = "abc+bcd=def";
        assertEquals("[def, bcd, abc]", Arrays.asList(tool.tokenize(text)).toString());
    }

}