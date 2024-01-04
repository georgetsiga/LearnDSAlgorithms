import sorting.Output;

public class Solution {

    public static int callPoints(String[] ops) {
        int result = 0;
        int[] records = new int[ops.length];
        int size = 0;
        for (int i=0; i< ops.length;i++) {

            String value = ops[i];
            if (isNumeric(value)){
                int n = Integer.parseInt(value);
                records[size] = n;
                result = result + n;
                size++;
            } else {
                switch (value) {
                    case "C":
                        result = result - records[size-1];
                        records[size-1] = 0;
                        size--;
                        break;
                    case "D":

                        records[size] = records[size - 1] * 2;
                        result = result + records[size];
                        size++;
                        break;
                    case "+":
                        records[size] = records[size - 1] + records[size-2];
                        result = result + records[size];
                        size++;
                        break;
                }
            }
        }
        return result;
    }

    public static boolean isNumeric(String x) {
        try{
            Integer.parseInt(x);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //String[] ops = {"5", "-2","4", "C", "D", "9", "+", "+"};
        String[] ops = {"1"};
        //String[] ops = {"5", "2", "C", "D", "+"};
        int i = callPoints(ops);
        System.out.println(i);
    }

    /*public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        //solution.findMedianSortedArrays(nums1, nums2);
        int[] num = {2,7,9,3,1};
        int rob = solution.rob(num);
        System.out.println(rob);
    }

    public int rob(int[] nums) {
        int output = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i +1; j < nums.length; j++) {

            }
        }
        return output;
    }

    public void findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int sumIndex = 0;
        int[] sum = new int[m + n];
        int mid = (sum.length - 1) /2;
        int i = 0;
        int j = 0;
        while (i <= (m-1) && j <= (n-1)){
            if (nums1[i] < nums2[j]) {
                sum[sumIndex] = nums1[i];
                i++;
            } else {
                sum[sumIndex] = nums2[j];
                j++;
            }
            sumIndex++;
        }
        while (i <= (m-1)) {
            sum[sumIndex] = nums1[i];
            i++;
            sumIndex++;
        }
        while (j <= (n-1)) {
            sum[sumIndex] = nums2[j];
            j++;
            sumIndex++;
        }
        double midVal = sum[mid];
        if ((sum.length -1) % 2 != 0) {
            midVal = (sum[mid] + sum[mid + 1]) / (double)2;
        }
        Output.display(sum, sum.length);
    }*/
}
