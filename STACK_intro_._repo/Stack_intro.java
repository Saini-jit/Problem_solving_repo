public class Stack_intro{
    private int[] arr;
    private int capicity;
    private int top;
    Stack_intro(int cap)
    {
        capicity=cap;
        arr=new int[capicity];
        top=-1;
    }
    public void push(int x)
    {
        if(top==(capicity-1)){
        System.out.println("stack Overflow");
        }
        else{
        ++top;
        arr[top]=x;
    }}
    
    public int pop(){
        if(top==(-1))
        {
            System.out.println("Stack Underflow");
            return top;
        }
        else{
            return arr[top];
            top--;
        }
    }
        
    public static void main(String[] args) {
        // 1.stack follows the FILO principle means First in last out 
        // 2. in stack push(instation) pop(dletion) operations or done one the top element of the stack
        // 3. stack's are of 2 type static and dynamic

        //  static stack
        //      1. static stack is created by array and
        //          there is a problem of over flow (means trying to insert a element in a full stack).
        //          and under flow (means trying to remove element     from impty stack)

        //  dinamic stack
        //      1. dynamic stack cand be made by linkedlist and
        //      2. it can also made by vctor in c++ and arraylist in java.
        //      3. there is no problem of overflow and underflow

        //making stack using array

        
        

    }
}
