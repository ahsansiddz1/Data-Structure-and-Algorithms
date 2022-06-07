public class TowerOfHanoi {
    public static void main(String[] args) {
   int n=3;
   TOH(n,"S","H","D");
    }
    static void TOH(int n,String src,String helper,String dest)
    {
        if(n==1)
        {
            System.out.println("Transferring disk"+n + "from"+src+"to"+dest);
            return;
        }
        //transfer top n-1 from src to helper using dest as 'helper'
        TOH(n-1,src,dest,helper);

        //transfer nth from src to dest
        System.out.println("Transferring disk"+n + "from"+src+"to"+dest);

        //transfer n-1 from helper to dest using src as 'helper'
        TOH(n-1,helper,src,dest);

    }
}
