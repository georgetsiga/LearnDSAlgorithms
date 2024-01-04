public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7}; //3
        //int[] nums = {-1,-100,3,99}; //2
        int k = 3;
        rotateArray.rotate(nums, k);
        rotateArray.display(nums);
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k < 0) k += nums.length;

        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length-1);

    }

    public void reverse(int[] nums, int si, int ei){

        while(si < ei){
            int temp = nums[ei];
            nums[ei] = nums[si];
            nums[si] = temp;
            si++;
            ei--;
        }

    }

    public void display(int[] nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }
}
