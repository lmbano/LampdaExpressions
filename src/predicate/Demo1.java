package predicate;

import java.util.function.Predicate;
// predicates -->one parameter returns boolean
// use only if you have conditional checks in your program ...
public class Demo1 {
    public static void main(String[] args) {

       //Example 1
        Predicate<Integer> p=i->(i>6);
        Predicate<String>pr=s->(s.length()>4);


        System.out.println(p.test(9));
        System.out.println(p.test(6));

        //Example 2 --check lenth of given string if its greater than 4

        System.out.println(pr.test("Trevor"));// true
        System.out.println(pr.test("leo"));// false


        //Example 3: Print array elements whose size is greater than 4 from array

        String names[]={"David","leon","Tracy","Tanyaradzwa","Makatendeka","Makanakaishe"};

        for (String name:names) {
            if(pr.test(name)){
                System.out.println("name : " + name);
            }
        }

    }
}
