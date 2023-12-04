import java.io.IOException;

public class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        int total=0;
        for(int i=0;i<nums.length;i++){
            total=total+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i==0){
                rightSum=total-nums[i];
            }else{
                leftSum=leftSum+nums[i-1];
                rightSum=rightSum-nums[i];
            }
            if(leftSum==rightSum){
                return i;
            }
        }
        return -1;
    }
    public  static  void main(String args[]){
       int[] num={2,1,-1};
        int index = pivotIndex(num);
        System.out.println(index);
    }
}
