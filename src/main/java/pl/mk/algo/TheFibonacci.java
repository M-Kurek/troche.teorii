package pl.mk.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheFibonacci {

    public List<Integer> fillFibonacci(int n) {
        if (n < 0) {
            throw new IllegalStateException("not allowed : " + n);
        }
        switch (n) {
            case 0:
                return Arrays.asList();
            case 1:
                return Arrays.asList(0);
            case 2:
                return Arrays.asList(0, 1);
        }
        List<Integer> result = new ArrayList<>(n);
        result.add(0);
        result.add(1);

        for (int i = 0; i < n - 1; i++) {
            int prev2 = result.get(i);
            int prev1 = result.get(i + 1);
            result.add(prev1 + prev2);
        }
        return result;
    }

}
