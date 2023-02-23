package supplier;

import java.util.Date;
import java.util.function.Supplier;

public class demo1 {
    public static void main(String[] args) {
        Supplier<Date> supplier =()->new Date();
        System.out.println(supplier.get());
    }

}
