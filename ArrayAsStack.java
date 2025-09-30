import java.util.Stack;

public class ArrayAsStack{
    public static void main(String[] args) {
        
        //implement a queue with 2 stacks, common interview question


        Arraystack stck = new Arraystack();

        stck.enqueue(5);
        stck.enqueue(5);


        

    }
}

class Arraystack{

Stack<Integer> stackprimary = new Stack<>();
Stack<Integer> stackqueue = new Stack<>();

public void enqueue(int num){
    stackprimary.push(num);
}

public int dequeue(){

    if (stackqueue.isEmpty()){

        while (!stackprimary.isEmpty()){

            stackqueue.push(stackprimary.pop());
    }
    }



    return stackprimary.pop();

}





}







