import java.util.Arrays;
import java.util.Comparator;

public class LongestString {
    public static void main(String[] args){
        String arr[]={"java","microservices","cricketfavouritespot","bicycle","iu"};
        String s = Arrays.stream(arr)
                .max(Comparator.comparing(String::length))
                .orElse(null);

        //OR
//        String s = Arrays.stream(arr)
//                .reduce((word1,word2)->word1.length()>word2.length()?word1:word2)
//                .get();         //using reduce

//        String s = Arrays.stream(arr)
//                .min(Comparator.comparing(String::length))
//                .orElse(null);    //for minimum length

        System.out.println(s);
    }
}
