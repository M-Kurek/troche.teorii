package pl.mk.charset;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;

public class CharsetUtil {

    public static List<Character> findBanned(String charsetName, String text) {
        List<Character> notMatched = new ArrayList<Character>();
        char[] chars = text.toCharArray();
        CharsetEncoder encoder = Charset.forName(charsetName).newEncoder();
        for (char c : chars) {
            if (!encoder.canEncode(c)) {
                notMatched.add(c);
            }
        }
        return notMatched;
    }
}
