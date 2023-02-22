package predicate;


import java.util.function.Predicate;

// Joning Predicates - and , or, negate
// p1 --- checks number is even
// p2 -- checks greater than 50
public class Demo3 {

    public static void main(String[] args) {

int an[]={2,4,6,889,90,120,12,11,15,18,200};

        Predicate<Integer> pr1= n->n%2==0;

        Predicate<Integer> pr2= n->n>50;

        System.out.println("Bellow are EVEN Numbers Greater than 50 ");
        // and
        for(int a:an){
            if(pr1.and(pr2).test(a)){ // (pr1.test(a) && pr2.test(a)){

                System.out.println(a);
            }
        }
// or
        System.out.println("Bellow are EVEN Numbers or numbers Greater than 50 ");
        for(int a:an){
            if(pr1.or(pr2).test(a)){ // (pr1.test(a) && pr2.test(a)){

                System.out.println(a);
            }
        }
// negate
        System.out.println("Bellow are EVEN Numbers or numbers Greater than 50 ");
        for(int a:an){
            if(pr2.negate().test(a)){ // (pr1.test(a) && pr2.test(a)){

                System.out.println(a);
            }
        }


    }
}
