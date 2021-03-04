package com.livestudy.fifteen;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionInterfaceTest {
    public static void main(String[] args) {
        //Function과 Predicate차이 : 리턴타입
        Function<Integer,Integer> function = (num) -> num+10;
        int apply = function.apply(10);
        System.out.println(apply);

        Predicate<Integer> predicate = (integer -> integer > 0);
        boolean test = predicate.test(10);
        System.out.println(test);

        Consumer<Integer> consumer = (integer -> System.out.println(integer + 10));
        consumer.accept(10);

        Supplier<String> supplier = () -> "Functional Interface Test";
        String result = supplier.get();
        System.out.println(result);

    }
}
