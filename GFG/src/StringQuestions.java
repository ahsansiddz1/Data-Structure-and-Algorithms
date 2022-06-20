import java.util.HashSet;

public class StringQuestions {


    //------------------------------------------------------------------------

    // >>>>>>>>>>    Reverse a string by recursion <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
// Time complexity = O(n) where n is the size of string
//    static void reverse(String str,int idx)
//    {
//        if(idx==0)
//        {
//            System.out.print(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        reverse(str,idx-1);
//    }

    //------------------------------------------------------------------------

    // >>>>>>>>>>    Find the first and last occurence of string by recursion <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Time complexity = O(n) where n is the size of string
//   static int first=-1, last=-1;
//    static void findOccurence(String str,int idx,char element)
//    {
//
//        if(idx==str.length())
//        {
//            System.out.println("first Occurence : " + first);
//            System.out.println("Last Occurence : "+last);
//            return;
//        }
//        if(str.charAt(idx)==element)
//        {
//            if(first==-1)
//            {
//                first=idx;
//            }
//            else
//                last=idx;
//        }
//        findOccurence(str,idx+1,element);
//    }

    // >>>>>>>>>>    Check if an array is sorted <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Time complexity = O(n) where n is the size of string
//    static boolean  isSorted(int[] arr,int idx)
//    {
//        if(idx==arr.length-1)
//        {
//            return true;
//        }
//        if(arr[idx]<arr[idx+1])
//        {
//            return isSorted(arr,idx+1);
//
//        }
//        else
//            return false;
//
//    }

    // >>>>>>>>>>    Move all the x to the end of string <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Time complexity = O(n) where n is the size of string
//    static int count=0;
//    static StringBuilder newString=new StringBuilder();
//    static void poschange(String str,char ch,int idx)
//    {
//        if(idx==str.length())
//        {
//            for(int i=0; i<count;i++ )
//            {
//                newString.append(ch);
//            }
//            System.out.println(newString);
//            return;
//
//        }
//        if(str.charAt(idx)==ch)
//        {
//            count++;
//        }
//        else {
//            newString.append(str.charAt(idx));
//        }
//        poschange(  str,  ch,  idx+1);
//    }

    // >>>>>>>>>>    Remove duplicates from the string <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Time complexity =
//    static boolean[] map = new boolean[26]; //in starting all index contains 'false' or '0' value
//
//    static void removeDuplicates(String str, int idx, String newStr) {
//        if (idx == str.length()) {
//            System.out.println(newStr);
//            return;
//        }
//        if (str.charAt(idx) >= 65 && str.charAt(idx) <= 90) //for capital characters
//        {
//            if (map[str.charAt(idx) - 'A']  ) { //Runs only if index contains 'true' or '1' value
//                removeDuplicates(str, idx + 1, newStr);
//            } else {
//                newStr += str.charAt(idx);
//                map[str.charAt(idx) - 'A'] = true;
//                removeDuplicates(str, idx + 1, newStr);
//            }
//        } else { //for small letters
//            if (map[str.charAt(idx) - 'a']) {
//                removeDuplicates(str, idx + 1, newStr);
//            } else {
//                newStr += str.charAt(idx);
//                map[str.charAt(idx) - 'a'] = true;
//                removeDuplicates(str, idx + 1, newStr);
//            }
//        }
//    }
    // >>>>>>>>>>    subsequences of a string. <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Time complexity - O(2^n)
    public static void printSubseq(String str, int idx, String res) {
        if (idx == str.length()) {
            System.out.println(res); // 1 a 2 ab 3 abc 2ab
            return;
        }
//choose
        printSubseq(str, idx + 1, res + str.charAt(idx));
//don't choose
        printSubseq(str, idx + 1, res);
    }




    // >>>>>>>>>>   Print only Unique subsequences of a string. <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    //Time complexity -
    public static void printUniqSubseq(String str, int idx, String newString, HashSet<String> allsubseq) {
        if (idx == str.length()) {
            if(allsubseq.contains(newString)) {
                return;
            }
            allsubseq.add(newString);
            System.out.println(newString);
            return;
        }
//choose
        printUniqSubseq(str, idx + 1, newString + str.charAt(idx),allsubseq);
//don't choose
        printUniqSubseq(str, idx + 1, newString,allsubseq);

// >>>>>>>>>>    keypad combinations <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
        //Time complexity -

    }




    public static void main(String[] args) {
        //   reverse("zddisnasha",9);
        //   findOccurence("ahsan",0,'a');
        //   int[] arr={1,2,3,4};
        //   System.out.println("Array is sorted : " + isSorted(arr,0));
        //   poschange( "ahzzszansidd",'z',0);
        //   removeDuplicates("SSssiddDzZz", 0, "") ;
        //   String str1 = "abc";
       //    printSubseq(str1, 0, "");
        //keypad combinations

        String str2 = "aaa";
        HashSet<String> set=new HashSet<>();
        printUniqSubseq(str2, 0, "",set);
    } //main function closed
}
