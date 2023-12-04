import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class EmployeeSummary{
    private int id;
    private String empName;
    private int age;

    public int getId() {
        return id;
    }

    public EmployeeSummary(int id, String empName, int age) {
        this.id = id;
        this.empName = empName;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class SummaryStatistics {
    public static void main(String[] args) {
        List<EmployeeSummary> employeeList=
                Arrays.asList(new EmployeeSummary(1, "xyz", 18),
                        new EmployeeSummary(2, "abc", 19),
                        new EmployeeSummary(3, "tgy", 15),
                        new EmployeeSummary(4, "pqr", 14));
        double avgAge = employeeList.stream().mapToInt(s -> s.getAge())
               .summaryStatistics().getAverage();
        int maxAge = employeeList.stream().mapToInt(s -> s.getAge())
                .summaryStatistics().getMax();
        long sumAges = employeeList.stream().mapToInt(s -> s.getAge())
                .summaryStatistics().getSum();
        System.out.println(avgAge);
    }
}
//here mapToInt is manadaroty to use count,min,max,avaergae funcions of
//summary statistics