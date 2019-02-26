package pl.mk.lambdas;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static pl.mk.lambdas.Lambdazing.evaluate;

public class PredicatingTest {

    @Test
    public void printPredicateDemo() throws Exception {
        List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7).collect(Collectors.toList());

        System.out.print("\nPrint all numbers:");
        evaluate(list, (n)->true);

        System.out.print("\nPrint no numbers:");
        evaluate(list, (n)->false);

        System.out.print("\nPrint even numbers:");
        evaluate(list, (n)-> n%2 == 0 );

        System.out.print("\nPrint odd numbers:");
        evaluate(list, (n)-> n%2 == 1 );

        System.out.print("\nPrint numbers greater than 5:");
        evaluate(list, (n)-> n > 5 );
    }

    @Test
    public void inlineSumOfPower() throws Exception {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        final Stream<Integer> integers = list.stream().map(x -> x * x);
        final Optional<Integer> reduce = integers.reduce((x, y) -> x + y);
        int sum = reduce.get();
        System.out.println("SumOfPower " + sum);
    }

}