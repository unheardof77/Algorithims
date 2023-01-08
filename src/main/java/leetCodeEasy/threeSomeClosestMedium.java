package leetCodeEasy;

public class threeSomeClosestMedium {

    public static int threeSumClosest(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j< nums.length; j++){
                if(i==j)continue;
                for(int k = 0; k< nums.length; k++){
                    if(i==k || k== j)continue;
                    if(nums[i] + nums[j] + nums[k] < target ){

                    }
                }
            }
        }

        return 0;
    }
}
