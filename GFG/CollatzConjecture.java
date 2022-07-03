import java.util.Scanner;
/*
A simple and interesting problem of mathematics,
Mathematicians still trying to find the logical reasoning about this problem.

Problem Explanation:
If we choose any positive integer
and follows this rule:
if number is odd (3*num + 1 )
if number is ever (num /2 )
in the end the answer we will surely get is 1

As 1 is odd, still the formula is applicable
so, 1*3+1 =4
4 is even -> 4/2=2
2 is even -> 2/2=1
here we again got 1
and we stucked in 4->2->1 loop :)

 */
public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number of you choice : ");
        int no=sc.nextInt();
        System.out.println("Here the Rooller coaster starts...........");

        int count=0;

        //edge case
        if(no==1)
        {
            System.out.print("4->2->1->");
        }
        //-----------------------------------------------------------------------
        System.out.print(no+"->");
        while (no!=1)
        {
            if(no%2==0)
            {
                no=no/2;
                System.out.print(no+"->");
            }
            else{
                no=no*3+1;
                System.out.print(no+"->");
            }

            //For a new line after every 25th number
            count++;
            if(count==25){
                System.out.println();
                count=0;
                //==================================
            }

        }
        System.out.print("Loop to 4");
    }
}
