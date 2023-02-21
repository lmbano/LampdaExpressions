package predicate;

import java.util.ArrayList;
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

        Employee employee =new Employee("Sharon",50000, 3);
        Predicate<Employee>predicate=e->(e.salary>30000 && e.experience>3);

        System.out.println(predicate.test(employee));


        //// list

        ArrayList<Employee> all = new ArrayList<>();
        all.add(new Employee("Sharon",50000, 3));

        all.add(new Employee("Tracy",20000, 5));
        all.add(new Employee("Tanya",30000, 8));

        all.add(new Employee("Maka T",60000, 7));

        all.add(new Employee("Makanaka",1000000, 4));

        all.add(new Employee("Fadzi",100000, 11));
        all.add(new Employee("Alex",500000, 12));

for(Employee e : all){

    if(predicate.test(e)){
        System.out.println(e.ename + "  "+ e.salary);
    }
}


    }
}
