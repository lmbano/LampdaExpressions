package predicate;

import java.util.function.Predicate;

class Employee{

    String ename;
    int salary;
    int experience;
    Employee(String name, int sal, int exp){

        ename=name;
        salary=sal;
        experience=exp;
    }
}

public class demo2 {

    public static void main(String[] args) {

        // employee obj --> return if salary> 30 k and exeperince >3

        Employee employee =new Employee("Sharon",50000, 5);
        Predicate<Employee>predicate=e->(e.salary>30000 && e.experience>3);

    }
}
