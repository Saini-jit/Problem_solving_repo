public class Stack_using_dinamic_array_implimentation{
    private int[] arr;
    private int top;
    private int capicity;

    Stack_using_dinamic_array_implimentation(){
        capicity=5;
        top=-1;
        arr= new int[capicity];
    }

    public void resize(){
        capicity<<=1;
        int[] newarr=new int[capicity];
        int i=0;
        while(i<top){
            newarr[i]=arr[i];
            i++;
        }
        arr=newarr;
    }

    public void push(int num){
        if(top==(capicity-1)){
            resize();
        }

        ++top;
        arr[top]=num;
    }

    public int peek(){
        return arr[top];
    }

    public int size(){
        return top+1;
    }

    public static void main(String[] args) {
        Stack_using_dinamic_array_implimentation st=new Stack_using_dinamic_array_implimentation();
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        st.push(1);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.capicity);
        st.push(2);
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.capicity);
        
    }
}