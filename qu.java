import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class qu{//popular interview question, reversing a queue.
    public static void main(String[] args) {
        

        Queue<Integer> que = new ArrayDeque<>();

        que.add(10);
        que.add(20);
        que.add(30);
        reverse(que);

        System.out.println(que);





    }

    public static void reverse(Queue<Integer> queue){

        //can only use add remove is empty, use a stack

        Stack<Integer> stack = new Stack<>();


        while(!queue.isEmpty()){

            stack.push(queue.remove());



        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }




    }


}