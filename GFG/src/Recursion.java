public class Recursion {
    public static void main(String[] args) {
        int[] a = {3, 4, 2, 0, 12, -23, 12, 2, 4, 5};

        //        System.out.println(fact(5));
        //        fib(0,1,10);
        //        fib(10);
        //      System.out.println(power(2,5));

    } //main function closed

    //-----------------------------------
    // >>>>>>>>>>  Recursive Factorial<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//    static int fact(int n)
//    {
//        if(n==1)
//            return 1;
//
//           return n*fact(n-1);
//    }
    //-----------------------------------------
    // >>>>>>>>>> Non Recursive factorial <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
//    static int fact(int n)
//    {
//        int fact=1;
//        if(n==1)
//        {
//            return fact;
//        }
//        while(n>1)
//        {
//            fact=fact*n;
//            n--;
//        }
//        return fact;
//    }

    //------------------------------------------------------------------------
    // >>>>>>>>>>  Recursive fibnocci<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    //    static void fib(int a ,int b,int n)
    //    {
    //        if(n==0)
    //            return;
    //        System.out.print(a+" ");
    //        fib(b,a+b,n-1);
    //    }

    //------------------------------------------------------------------------

    // >>>>>>>>>>  Non Recursive fibnocci<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

//    static void fib(int n)
//    {
//        if(n==0)
//        {
//            return;
//        }
//        int a=0;
//        int b=1;
//        System.out.println(a+" ");
//        while (n>0)
//        {
//            System.out.println(b+" "); //5 3 3 2 1 --> 0
//           int temp=b;
//            b=a+b; //b=2 a=1
//            a=temp;
//            n--;
//        }
//    }

    //------------------------------------------------------------------------

    // >>>>>>>>>>    Recursive power <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0)
            return (power(x, n / 2) * power(x, n / 2));
        else
            return (x * power(x, n / 2) * power(x, n / 2));
    }



}