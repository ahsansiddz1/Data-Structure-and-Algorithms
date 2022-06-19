 //https://assets.leetcode.com/users/images/377529a3-4939-48f2-9aa3-12db043a4f90_1654925552.9034698.jpeg
 //https://leetcode.com/problems/permutations/
 import java.util.*;

class leetCodeArrayListProb {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        handle(output,0,nums);
        return output;
    }
    public static void handle(List<List<Integer>> output, int index, int[] nums) {

        if (index >= nums.length) {
            List<Integer> op = new ArrayList<>();
            for (int k : nums) {
                op.add(k);
            }
            output.add(new ArrayList<>(op));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            swap(nums, index, i);
            handle(output, index + 1, nums);
            // make array in older state for further operations.
            swap(nums, index, i);
        }
    }

    public static void swap(int[] ip, int index, int i) {
        int temp = ip[index];
        ip[index] = ip[i];
        ip[i] = temp;
    }

     public static void main(String[] args) {
         int[] nums={1,2,3};
         System.out.println( permute(nums));
     }
}