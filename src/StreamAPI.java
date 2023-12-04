import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//class Employee{
//    int id,
//
//}
//print duplicate chars in sequence
public class StreamAPI {
    public static void main(String[] args){
        String text="wonederedr";
//        List<String> collect = Arrays.stream(text.split("")).collect(Collectors.groupingBy
//                        (Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream()
//                .filter(s -> s.getValue() > 1).map(s -> s.getKey()).collect(Collectors.toList());
        //OR
        List<String> collect = Arrays.stream(text.split("")).collect(Collectors.groupingBy
                        (Function.identity(), LinkedHashMap::new, Collectors.counting())).entrySet().stream()
                .filter(s -> s.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(collect);

    }
}
