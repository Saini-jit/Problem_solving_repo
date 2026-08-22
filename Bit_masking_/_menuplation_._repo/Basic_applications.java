public class Basic_applications {

    // set a bit on any position in a number
    public int setbit(int num, int pos){

        pos&=0xF;  //pos%=16;  means returns from 0 to 15 either pos is small then 16 or more then 16;

        return num|=(1<<pos);
    }

    // Unset or clear a bit from any position of a number
    public static int unsetbit(int num, int pos) {
        pos&=0xF;

        return num&=~(1<<pos); //if we directly use 0 to clear bit it will not work
    }

    //Toggling a bit at n'th position "switching value from on to off and vice versa"
    public static int Toggling(int num, int pos){
        pos&=0xF;
        return num^=(1<<pos);  // XOR operation switch's the value of form on to off and vice versa if '0^1=1' and if '1^1=0'. We.
    }

    // Checking is the bit on n'th position is set or unset
    public static boolean issetbit(int num, int pos){
        pos&=0xF;
        //return 1<<pos==(num&(1<<pos));// because & operation returns only value which is made by those set bis which are same in the both operents;
        return 1==((num>>pos)&1); //this way is works because if any number is operated by & and 1 then we gets 1 in return 
    }

    // Check that a number is a power of 2
    public static boolean is_pow_of_2(int num)
    {
        return 0==(num&(num-1));
    }

    // counting set bits in andf integer
    public static int setbitcount(int num){
        int c=0;
        while(num>0){
            c+=1&num;
            num>>=1;
        }
        return c;
    }

    //position of right most set bit
    
    public static int rightsetbit(int num){
        int c=0;
        if((num&1)==1){return 1;}
        else{
        --num;      // another way is num=num^&(num-1); or num=num^(num&(num-1));
        while((num & 1)>0){ //and while(num>0) 
            ++c;
            num>>=1;
        }}
        return c+1;
    }

    static int rightmostsetbit(int num){
        if(num==0){
            return 0;
        }
        if((num&1)==1){
            return 1;
        }
        else{
        num-=1;
        int count=0;
        while((num&1)!=0){
            count++;
            num>>=1;
        }
        return count+1;
    }}
    public static void main(String[] args) {

        //if function is not static then have to create an object
        Basic_applications b=new Basic_applications();
        System.out.println(b.setbit(5,3)); 

        System.out.println(unsetbit(7,17));

        System.out.println(Toggling(3,18));

        System.out.println(issetbit(8,2));

        System.out.println(is_pow_of_2(0x40));

        System.out.println(setbitcount(7));

        System.out.println(rightsetbit(10));

        System.out.println(rightmostsetbit(8));
    }
}
