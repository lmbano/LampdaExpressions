package function;

import java.util.function.Function;

public class Demo3 {

/*Function chaining
---------------
andThen() f1 f2 starts with f1 the go to f2
compose() starts with f2 then go to f1 with the result-- reverse
*/
    public static void main(String[] args) {

        Function<Integer,Integer>f1 =n->n*2;
        Function<Integer,Integer>f2 =n->n*n*n;
        System.out.println(f1.andThen(f2).apply(2)); // 64
        System.out.println(f1.compose(f2).apply(2)); // 64




    }
}
