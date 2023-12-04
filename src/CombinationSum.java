import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> interList=new ArrayList<>();
        List<List<Integer>> mainList=new ArrayList<>();
        findCombination(candidates,target,interList,mainList,0);
        //System.out.println(mainList);
        return mainList;
    }
    static void findCombination(int[] candidates,int target,List<Integer> integerList,List<List<Integer>> mainList,int start){
        if(target<0){
            return;
        }
        if(target==0){
            mainList.add(new ArrayList<>(integerList));
            //System.out.println(mainList);
        }
        //else {
            for (int i = start; i < candidates.length; i++) {
                //2 2 2
                //  sum=sum+candidates[i];
                integerList.add(candidates[i]);
                findCombination(candidates, target - candidates[i], integerList, mainList, i);
                integerList.remove(integerList.size() - 1);
                // sum = sum - candidates[i];
            }
        //}
        return;
    }
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};//2367
        int target = 7;
        CombinationSum cm=new CombinationSum();
        cm.combinationSum(candidates,target);
    }
}
//2 2 3