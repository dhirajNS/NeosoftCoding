import java.util.*;

public class Diff2Arrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> finalList=new ArrayList<>();
        finalList.add(new ArrayList<>());
        finalList.add(new ArrayList<>());
//        List<Integer> tempList=new ArrayList<>();
//        List<Integer> tempList2=new ArrayList<>();
        Set<Integer> numSet1 = new HashSet<>();
        Set<Integer> numSet2 = new HashSet<>();
        for(Integer num1:nums1){
            numSet1.add(num1);
        }
        for(Integer num2:nums2){
            numSet2.add(num2);
        }
        for(Integer num1:numSet1){
            if(!numSet2.contains(num1)){
                finalList.get(0).add(num1);
            }
        }
        for(Integer num2:numSet2){
            if(!numSet1.contains(num2)){
                finalList.get(1).add(num2);
            }
        }

        return finalList;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        List<List<Integer>> difference = findDifference(nums1, nums2);
        System.out.println(difference);
    }
}
