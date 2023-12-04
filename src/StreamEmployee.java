import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
     private  int id;
     private String name;
     private long salary;

    public Employee(int i, String name, long sal) {
        this.id=i;
        this.name=name;
        this.salary=sal;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class StreamEmployee {
    public static void main(String args[]){
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(1,"Dhiraj",4000));
        employeeList.add(new Employee(2,"Virat",3000));
        employeeList.add(new Employee(3,"Rohit",2000));
        employeeList.add(new Employee(4,"Kuldeep",5000));

//        Optional<Employee> first = employeeList.stream()
//                .sorted(Collections.reverseOrder(Comparator.comparing(Employee::getSalary))).
//                findFirst();
        Optional<Employee> first = employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary));
        System.out.println(first);
    }
}
