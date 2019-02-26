package pl.mk.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambdazing {
    static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list)  {
            if(predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
    }
}
