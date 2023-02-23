package consumer;

import java.util.function.Consumer;

/// Consumer chaining ...
public class Demo3 {
    public static void main(String[] args) {


        Consumer<String> c1 = s-> System.out.println(s+ " "+"is white");
        Consumer<String> c2 = s-> System.out.println(s+ " "+"is four legged");
        Consumer<String> c3 = s-> System.out.println(s+ " "+"is eating grass");

//        c1.accept("Cow");
//        c2.accept("Cow");
//        c3.accept("Cow");
        c1.andThen(c2).andThen(c3).accept("Cow");
    }

}
