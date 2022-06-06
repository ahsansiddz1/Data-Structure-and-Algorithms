//https://www.youtube.com/watch?v=OSoO8eCEEC8&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=15
public class BitManipulation {
    public static void main(String[] args) {
//------------------------------------------------------------
        //Topic : Left Shift
        //--------------------------------------
        int num=2; //0010
        System.out.println("Original num : " + num);
        //Question : do left shift by 2
        //0010 --> 1000
        int pos=2;
        num=num<<pos;
        System.out.println("After doing left shift by 2 : " + num);
//--------------------------------------
        //Topic : Right Shift
 //--------------------------------------
        System.out.println("---------------------------");
          num=4; //0100
        System.out.println("Original num : " + num);
        //Question : do right shift by 2
        //0100 --> 0001
         pos=2;
        num=num>>pos;
        System.out.println("After doing right shift by 2 : " + num);
//------------------------------------------------------------
        //BIT OPERATIONS
        //Operations of bit : 1/Get bit 2/ Set bit 3/ Clear bit 4/ Update Bit

//Operation 1 :Get bit
        //1. Question  : Get the 3rd bit (position =2 ) of a number n.  (n=0101)

        //We must have to perform the two operation to know about the postion of bit
        //operation 1 : bitmask : 1<<i ; where "i" is the given position.
        //operation 2 : Perfom And operation between bitmask and given number

        //Soltion
        System.out.println("------------------------------");
        System.out.println("Get bit operation");
        int n=5; //given in question
        int position=2; //given in question
        //now performing the above two operation
        int bitmask=1<<position; //i.e 1<<2 -> 0001<<2 --> result : 0100
        int res=bitmask&n;
        if(res==0)
        {
            System.out.println("Number is 1");
        }
        else
        System.out.println("Number is 0");

        //-----------------------------------------------------------
        //Operation 2 :set bit
        //2. Question  : set the 2nd bit (position =1 ) of a number n.  (n=0101)

        //We must have to perform the two operation to know about the postion of bit
        //operation 1 : bitmask : 1<<i ; where "i" is the given position by user.
        //operation 2 : Perform OR ( | ) operation between bitmask and given number

        //Soltion
        System.out.println("------------------------------");
        System.out.println("Set bit operation");
          n=5; //given in question
          position=1; //given in question
        //now performing the above two operation
          bitmask=1<<position; //i.e 1<<2 -> 0001<<1 --> result : 0010
         res=bitmask|n; //0010 | 0101 ==> 0111

            System.out.println("Result : "  + res);

        //-----------------------------------------------------------
        //Operation 3 :clear bit
        //3. Question  : clear the 3rd bit (position =2 ) of a number n.  (n=0101) --0100 1011 & 0101 0001

        //We must have to perform the two operation to know about the postion of bit
        //operation 1 : bitmask : 1<<i ; where "i" is the given position by user.
        //operation 2 : Perform AND ( & ) operation between NOT (~)bitmask and given number(N)
        //Soltion
        System.out.println("------------------------------");
        System.out.println("Clear bit operation");
        n=5; //given in question
        position=2; //given in question
        //now performing the above two operation
        bitmask=1<<position; //i.e 1<<2 -> 0001<<1 --> result : 0100
        res=n & (~(bitmask)); //0101 & 1011 ==> 0001

        System.out.println("Result : "  + res);

//---------------------------------------------------------------------------
        //Operation 4 :Update bit
        //3. Question  : update 2nd bit (position =1) of a number n.  (n=0101)
        //Given operation =1

        //if operation =0 --> clear bit operation perform
        //if operation==1 --> set bit operation perform


        //Soltion
        System.out.println("------------------------------");
        System.out.println("Update bit operation");
        n=5; //given in question
        int operation=1;
        position=1; //given in question

        if(operation==1)
        {
            //set bit operation
            bitmask=1<<position;
            res=bitmask|n;
            System.out.println("Result : " + res);
        }
        else{
            //clear bit operation
            bitmask=1<<position;
            res=n & (~(bitmask));
            System.out.println(res);
        }
    }
}
