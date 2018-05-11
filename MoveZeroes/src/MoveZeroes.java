public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        MoveZeroes test = new MoveZeroes();
        test.moveZeroes(nums);
    }

    public void moveZeroes(int[] nums){
        int index=0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        while(index < nums.length){
            nums[index++] = 0;
        }
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
