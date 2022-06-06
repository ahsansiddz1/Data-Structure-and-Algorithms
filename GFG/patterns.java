public class patterns {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------
    //Butterfly Patterns
        int n=4; //row size

    //upper half
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            int spaces=2*(n-i);

            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }

    //lower half

        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            int spaces=2*(n-i);

            for(int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println( );
        }

        //--------------------------------------------------------------------------------------------------



        //Rhombus Pattern
  int rows=5;
       for(int i=1; i<rows; i++) //rows
       {
               //spaces
               for(int k=1; k<=rows-i; k++)
               {
                   System.out.print(" ");
               }

           //stars
           for(int k=1; k<=rows; k++)
           {
               System.out.print("*");
           }
           System.out.println();
       }

        //other half

        for(int i=1; i<rows; i++) //rows
        {
            //spaces
            for(int k=1; k<=i; k++)
            {
                System.out.print(" ");
            }

            //stars
            for(int k=1; k<=rows; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //--------------------------------------------------------------------------------------------------

        //Pyramid

        for(int i=1; i<=rows; i++)
        {
            //spaces

            for(int j=rows; j>=i; j--)
            {
                System.out.print(" ");
            }
            //numbers
            for(int k=1; k<=i; k++)
            {
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.println();
        }

        //--------------------------------------------------------------------------------------------------
        //Palindrome
        for(int i=1; i<=rows; i++)
        {
            //spaces

            for(int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }

            //1st half numbers
            for(int k=i; k>=1; k--)
            {

                System.out.print(k);
            }

            //2nd half numbers
            for(int l=2; l<=i; l++)
            {

                System.out.print(l );
            }
            System.out.println();
        }


        //--------------------------------------------------------------------------------------------------
        //Diamond
        //upperSide
        for(int i=1; i<=rows; i++) {
            //spaces

            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            //stars
            int stars=2*(i-1) + 1;
            for(int k=1; k<=stars; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
  //lowerSide
        for(int i=rows;  i>=1; i--) {
            //spaces

            for (int j = rows; j >i; j--) {
                System.out.print(" ");
            }

            //stars
            int stars=2*(i-1) + 1;
            for(int k=1; k<=stars; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        //--------------------------------------------------------------------------------------------------
        // print hollow rhombus
       for(int i=1; i<=5; i++)
       {
           //starting spaces
           for(int j=5; j>i; j--)
           {
               System.out.print(" ");
           }
           //stars
           for(int k=1; k<=5; k++) {
               if(i==1 || i==5 || k==1 || k==5)
               {
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }

           }
           System.out.println();
       }

        //--------------------------------------------------------------------------------------------------
        // print hollow butterfly
        //1st part
        for(int i=1; i<=5; i++)
        {
            //1st half starts

            for(int j=1; j<=i; j++)
            {
                if(j==1 || j==i)
                System.out.print("*");
                else
                    System.out.print(" ");
            }

            //spaces
             int spaces =2*5 - 2*i;
            for(int j=1; j<=spaces; j++)
            {
                System.out.print(" ");
            }

            //2nd half stars
            for(int j=1; j<=i; j++)
            {
                if(j==1 || j==i)
                System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


        //2nd part

        for(int i=5; i>=1; i--)
        {
            //1st half starts

            for(int j=1; j<=i; j++)
            {
                if(j==1 || j==i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            //spaces
            int spaces =2*5 - 2*i;
            for(int j=1; j<=spaces; j++)
            {
                System.out.print(" ");
            }

            //2nd half stars
            for(int j=1; j<=i; j++)
            {
            if(j==1 || j==i)
                System.out.print("*");
            else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    }





