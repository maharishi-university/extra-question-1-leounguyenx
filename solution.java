
public class solution{
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        getIndices(nums, target);
    }

    public static void getIndices(int nums[], int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    System.out.println("[" + i + "," + j + "]");
                    
                }
            }
        }
    }
};

