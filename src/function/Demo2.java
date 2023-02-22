package function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;

    Employee(String enamme, int salary){
        this.ename=enamme;
        this.salary=salary;
    }
}

public class Demo2 {


    public static void main(String[] args) {

        /// Reqirement to take an employee and calculate bonus based on salary
        ArrayList<Employee> emplist =new ArrayList<>();

        emplist.add(new Employee("Tanya", 50000));
        emplist.add(new Employee("Fadzi", 22000));

        emplist.add(new Employee("Makatendeka", 55000));

        emplist.add(new Employee("Makanaka", 35000));


        Function<Employee,Integer>fn=e->{
            int sal =e.salary;
            if(sal>=10000 && sal <=20000)
                return (sal*10/100);

            else if(sal>=20000 && sal <=30000)
                return (sal*20/100);
            else if(sal>=30000 && sal <=50000)
                return (sal*30/100);
            else
                return (sal*40/100);
        };
        Predicate<Integer> predicate = s->s>5000;

        for(Employee e:emplist){
           int bonus= fn.apply(e); // Function

           if(predicate.test(bonus)) // Predicate
           {

            System.out.println(e.ename + "  " + e.salary+"  "+" bonus is : "+ bonus);
        }
    }}
}


