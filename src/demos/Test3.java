package demos;

@FunctionalInterface  //Explicitly making the class a functional intarface
interface  Cab2 {

    public void bookCab(String source, String destination);
}

/* This code is replaced by the lampda Expression

class Ola implements Cab2{
    public void bookCab(String src, String dest){

        System.out.println(" Ola cab is booksed fro "+ src+ " to " + dest);
    }

    (s,d)->System.out.println(" Ola cab is booksed fro "+ s+ " to " + d);


}*/

public class Test2 {
    public static void main(String[] args) {

        Cab2 cab = (s,d)->System.out.println(" Ola cab is booksed fro "+ s+ " to " + d);
        cab.bookCab("Dzivarasekwa","town");


    }
}
