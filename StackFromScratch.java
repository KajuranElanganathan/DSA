import java.util.Arrays;

public class StackFromScratch{
    public static void main(String[] args) {
        


        //implement a stack with an int[] array, with the function
        //.pop
        //.peek
        //.push
        //.isEmpty()

        Stack stack = new Stack();

        stack.push(5);
        stack.push(10);
        stack.pop();

        int[] hello = stack.print();

        System.out.println(Arrays.toString(hello));





    }
}

class Stack{

    int[] arr = new int[5];
    int count = 0;

    public int pop(){

        if (count == 0){
            throw new IllegalStateException();
        }


        count --; //count var acts as a point to represent the length of the stack
        return arr[count];

    }

    public int peek(){

        if (count == 0){
            throw new IllegalStateException();
        }

        return arr[count-1];

        
    }

    public void push(int x){

        if (count == arr.length){
            throw new StackOverflowError();
        }

        arr[count] = x;
        count++;


        
    }
    public boolean isEmpty(){

        return (count == 0);
        
    }

    @Override //runs when u caall system.out.println
    public String toString(){

        var content = Arrays.copyOfRange(arr,0,count);
        return Arrays.toString(content);

    }













}