import java.util.ArrayList;
import java.util.List;

class prac {


//--------------------

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> output = new ArrayList<>(); //all lists

        ArrayList<Integer> oldarr=new ArrayList<>(); //oldarr
        for(int i=0; i<nums.length-1; i++)
           oldarr.add(nums[i]);

        ArrayList<Integer> newarr=new ArrayList<>(); //newarr

        printPermutation(output,oldarr,newarr);

        return output;
    }

public static  void  printPermutation( List<List<Integer>> output,ArrayList<Integer> oldarr,  ArrayList<Integer> newarr) {
    if (oldarr.isEmpty()) {
         List<Integer> op = new ArrayList<>();
        for (int k : newarr) {
            op.add(newarr.get(k));
        }
        output.add(new ArrayList<>(op));
    }

    for (int i = 0; i < oldarr.size(); i++) {

        ArrayList<Integer> currIntList = new ArrayList<>();

        currIntList.add(oldarr.get(i));
         if (i == 0 && oldarr.size() > (i + 1)) {
            newarr.add(oldarr.get(i + 1));
        }
        if (i > 0) {
            int tempstart = 0;

            while (tempstart < i) //goes from 0 to i-1
            {
                 newarr.add(oldarr.get(tempstart));
                tempstart++;
            }
            int tempend = i + 1;
            while (tempend < oldarr.size()) //checking if there is next position or index is availaible or not in oldarray
            { //goes from i+1 to total size  of array

                newarr.add(oldarr.get(tempend));
                tempend++;

            }

        }
        printPermutation(output, newarr, currIntList);
    }

}
    public static void main(String[] args) { //main method
        int[] nums={4,5,3};
        System.out.println( permute(nums));
    }
}