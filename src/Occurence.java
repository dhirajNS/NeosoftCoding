import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Occurence {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> countMap =new HashMap<>();
        Set<Integer> unique=new HashSet<>();
        for(Integer ele:arr){
            if(countMap.containsKey(ele)){
                countMap.put(ele,countMap.get(ele)+1);
            }else{
                countMap.put(ele,1);
            }
        }
        for(Map.Entry mapEle:countMap.entrySet()){
            if(!unique.add((Integer) mapEle.getValue())){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        boolean flag = uniqueOccurrences(arr);
        System.out.println(flag);
    }
}
