public class Bitwise_Operators{
    public static void main(String[] args){
        /*Bitwise Operators
        AND = & 
         _A_|_B_|_A&B_|
          0 | 0 |  0  |  
          0 | 1 |  0  |
          1 | 0 |  0  |
          1 | 1 |  1  |
         */
        
        System.out.println(5&4); //101 & 100 =100

        /*
        OR = | 
         _A_|_B_|_A|B_|
          0 | 0 |  0  |  
          0 | 1 |  1  |
          1 | 0 |  1  |
          1 | 1 |  1  |
         */
        
          System.out.println(5|4); //101 | 100 =101

        /*
        XOR = ^ 
         _A_|_B_|_A&B_|
          0 | 0 |  0  |  
          0 | 1 |  1  |
          1 | 0 |  1  |
          1 | 1 |  0  |
         */
        
         System.out.println(5^4); //101 ^ 100 =001

        /*
        NOT = ~ 
         _A_|_~A_|
          0 |  1 |      
          1 |  0 |  
        
          in computer any value like 2 in binary form 00...010 and it's compliment is 11...101
          */

         System.out.println(~5); // ~...000101 = ...111010 = -6 compliment of 5
        
         /*
         Left Shift = <<
         5<<2  ...000101 << 2 =...010100
        using right shift operator 1's means multiplication by '2^1' for example 5*(2)^2
         */
         System.out.println(5<<2);
         /*
         5>>2  ...000101 >> 2 =...000001
         using right shift operator 1's means devision by '2^1' for example 5/(2)^2
         */
         System.out.println(5>>2);

         /* + and - in binary numbers
         PLUS = +
         5+4=9  101 + 100 = 1001
         */
         System.out.println(5+4);
        /* 
        5-3=2  in computer 0...00101 + 1...1101 = 0...0010
            00..00101
           +11..11101
           =00..00010
           
           computer do's only '+' operation in arithmetic and '-' operator converts binary value in 2's compliment 
           first 1's compliment on 2 11...1100
           and second 2's compliment is done by adding 1 means 11...1101
         */
        System.out.println(5-2);
        /*
        Bit masking :: creating a mask for bit means creating a set of bits which converts our value in a specific formate
        like 
        to get only even values from a number
        like concider a binary number 00..001011101
        00..001011101 & 0xAAAAAAAA(10101010...10101010) =0..001000 = 8
        hear 0x means hexadecimal value and in hexadecimal A means 1010 means 10
        */
       System.out.println(93&0xAAAAAAAA);
    }
}