package function;

import java.util.function.Function;

public class Demo1 {
    public static void main(String[] args) {

        // perfoms action and returns a values of type r using the appy method

        // Example 1 take an integer and squre it and return the answer

        Function<Integer,Integer> fn =i->i*i;

        System.out.println(" After apply method " + fn.apply(50));
        System.out.println(" After apply method " + fn.apply(10));

        System.out.println(" After apply method " + fn.apply(100));

        // Example 2 take an String and return the length of the string

        Function<String,Integer> fn1 =i->i.length();

        System.out.println(" Length of the String is  " + fn1.apply("love you "));



    }
}
