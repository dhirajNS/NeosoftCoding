import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ParalletStream {
    public static void stream() {
        List<String> duumyy=new ArrayList<>();
        long startTime=0;
        long endTime=0;
        startTime=System.currentTimeMillis();
        //IntStream.rangeClosed(0,100).forEach(s->System.out.println(s));
        IntStream.rangeClosed(0,10000000).sum();
        endTime=System.currentTimeMillis();
        System.out.println("after seq steam>> "+(endTime-startTime));
        startTime=System.currentTimeMillis();
        IntStream.rangeClosed(0,10000000).parallel().sum();
        endTime=System.currentTimeMillis();
        System.out.println("after parallel steam>> "+(endTime-startTime));
    }
    public  static  void main(String args[]){
        stream();
    }
}
