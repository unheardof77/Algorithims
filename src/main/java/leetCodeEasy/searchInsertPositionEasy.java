package leetCodeEasy;

public class searchInsertPositionEasy {
    public static int searchInsert(int[] nums, int target){
        int midPoint =  ((nums.length-1) /2);
        int returnVal = midPoint;
        int previousMid =0;
        while(nums[midPoint] != target){
            int lowerMid = ((nums.length)- previousMid) /2;
            int highMid = ((nums.length) + previousMid)/2;

            System.out.println(midPoint);
            if(nums[midPoint] > target){
                if(true){
                    midPoint = lowerMid+1;
                }else{
                    midPoint = lowerMid;
                }
            }else{
                midPoint = highMid;
            }
            previousMid = midPoint;
            returnVal = midPoint;
        }
        return returnVal;
    }
}
