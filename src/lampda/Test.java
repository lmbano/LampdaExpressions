package demos;

@FunctionalInterface
interface  Cab{

    public void bookCab();
}

/* replaced by lampda experssion
class MyCar implements Cab{

    public void bookCab(){
        System.out.println("Mycar cab is booked ... !");
    }

    ()->System.out.println("Mycar cab is booked ... !");
}
*/


public class Test {
    public static void main(String[] args) {

Cab  car=()->System.out.println("Mycar cab is booked ... !");
car.bookCab();

    }
}
