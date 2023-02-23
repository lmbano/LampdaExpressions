package consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*
        Scenario
        Pass an Employee object in an arrayList
        based on salary calculate bonus of 10%
        verify if bonus is > 5000 print all details of Employees

        tasks involved

         1. Calculate the bonus of the Emp  // use Function
         2. Check the values of bonus > 5000 // use Predicate
         3. Print the Detail of the Emp if bonus value > 5000 // use Consumer

         */
class Employee{

    String ename;
    int salary;
    String gender;
    int age;

    public Employee(String ename, int salary, String gender, int age) {
        this.ename = ename;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }
}


public class Demo2 {
    public static void main(String[] args) {

                ArrayList<Employee> employeesList = new ArrayList<Employee>(Arrays.asList(
                new Employee("John", 20000,"Male",40),
                new Employee("Jane", 25000,"Female",29),
                new Employee("Bob", 35000,"Male",50)
        ));

        //task 1 - Function
        Function<Employee,Integer> functEmp=employee->(employee.salary*10)/100;

        //Task 2 -Predicate
        Predicate<Integer>predEmp =bonus->bonus>=5000;

        // Task 3 Consumer
        Consumer<Employee> consEmp = employee -> {

            System.out.println(employee.ename);
            System.out.println(employee.salary);
            System.out.println(employee.gender);
            System.out.println(employee.age);

        };

        for(Employee e : employeesList){

          int bonus= functEmp.apply(e);
          if(predEmp.test(bonus)){
              consEmp.accept(e);
              System.out.println(bonus);
          }
        }


    }
}
