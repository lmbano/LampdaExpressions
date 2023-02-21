package lampda;

@FunctionalInterface  //Explicitly making the class a functional intarface
interface  Cab3 {

    public String bookCab(String source, String destination);
}

// This code is replaced by the lampda Expression

/*class Ola implements Cab3{
    public String bookCab(String src, String dest){

        System.out.println(" Ola cab is booksed fro "+ src+ " to " + dest);

        return ("Prise : 50000 Rs");
    }

    //(s,d)->System.out.println(" Ola cab is booksed fro "+ s+ " to " + d);


}///*/

public class Test3 {
    public static void main(String[] args) {
      //  Ola ola = new Ola();
      //  Ola cab = (s,d)->{System.out.println(" Ola cab is booksed fro "+ s+ " to " + d);
        Cab3 ola =(from , to)->{

            System.out.println(" Ola cab is booksed fro "+ from+ " to " + to);

            return ("Prise : 50000 Rs");
        };


       System.out.println(ola.bookCab("Dzivarasekwa","town"));


    }
}
