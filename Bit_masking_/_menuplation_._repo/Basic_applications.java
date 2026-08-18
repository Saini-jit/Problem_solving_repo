public class Basic_applications {

    // set a bit on any position in a number
    public static int setbit(int num, int pos){

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
    public static void main(String[] args) {

        //if function is not static then have to create an object
        Basic_applications b=new Basic_applications();
        System.out.println(b.setbit(5,3)); 

        //if function is static then no need to create object
        System.out.println(setbit(4, 3));   

        System.out.println(unsetbit(7,17));

        System.out.println(Toggling(3,18));

        System.out.println(issetbit(8,2));
    }
}
