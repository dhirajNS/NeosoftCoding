import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecondHighestNo {
    public static void main(String[] args){
    int a[] = {5,2,9,11,11,30,21};
        //int b[] = {2,3,4,30};

//        List<Integer> collect = Arrays.stream(a).boxed().sorted(Collections.reverseOrder())
//                .collect(Collectors.toList());
//        //OR
//        Integer i = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder())
//                .skip(1).findFirst().get();
//        System.out.println(i);
//
        //second smallest number
        Integer i = Arrays.stream(a).boxed().distinct().sorted()
                .skip(1).findFirst().orElseThrow(()->new IllegalArgumentException("not found"));
        System.out.println(i);



    }
}
