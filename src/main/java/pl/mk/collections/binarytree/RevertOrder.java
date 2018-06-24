package pl.mk.collections.binarytree;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RevertOrder {
    Deque<String> stack;

    public String[] tokenize(String text) {
        stack = new ArrayDeque<String>();
        Pattern wordPattern = Pattern.compile("(\\p{Punct}|\\s)");
        String[] temp = wordPattern.split(text);
        for (String itemWord : temp) {
            if (itemWord != null && !"".equals(itemWord)) { //without commons ;)
                stack.push(itemWord);
            }
        }
        String[] result = new String[stack.size()];
        return stack.toArray(result);
    }

    public String[] tokenizeSpaceSeparated(String text) {
        stack = new ArrayDeque<String>();
        Matcher m = Pattern.compile("('[^']*?'|\\S)+").matcher(text);
        while (m.find()) {
            stack.push(m.group());
        }
        String[] result = new String[stack.size()];
        return stack.toArray(result);
    }
}
