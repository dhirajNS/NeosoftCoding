import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CommonBothArrays {
    public static void main(String[] args) {
        int arr1[] = {5, 2, 9, 11, 11, 30, 21};
        int arr2[] = {2, 3, 4, 30};

        List<Integer> commonElements = Arrays.stream(arr1).filter(
                num1 -> Arrays.stream(arr2)
                        .anyMatch(num2 -> num2 == num1)).boxed()
                .collect(Collectors.toList());
        System.out.println(commonElements);

        //reverse array in place
        int a[]={4,3,6,5,6,7};
        IntStream.range(0,a.length/2).forEach(s->{
            int temp=a[s];
            a[s]=a[a.length-s-1];
            a[a.length-s-1]=temp;
        });
        System.out.println("<<<>>>"+Arrays.toString(a));

        //find longest length stirng
        String str[]={"apple","banana","java","microservices","aws"};
        int maxl = Arrays.stream(str).mapToInt(String::length).max().orElse(0);
        System.out.println("<<<Longest string lenght only>>>"+maxl);


    }
}
