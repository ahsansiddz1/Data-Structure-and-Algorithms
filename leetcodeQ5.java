package data.structure;
//https://leetcode.com/problems/happy-number/
class leetcodeQ5 {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number = number / 10;
        }
        return ans;
    }
}


class NodeH {



    public static void main(String[] args) {
        leetcodeQ5 HN= new leetcodeQ5();

        System.out.println("Given number is Happy Number  : "  + HN.isHappy(20) );


    }
}