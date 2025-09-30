import java.util.Arrays;

public class ArrayAsQueue{
    public static void main(String[] args) {
        
        //arrayQueue
        //methods: enqueue,dequeue,peek,isEmpty,isFull
        //dont resize array, creating two pointers front and end


    ArrayQueue que = new ArrayQueue();

    que.enqueue(5);
    que.enqueue(15);
    que.enqueue(25);
    que.enqueue(25);

    que.enqueue(25);


    que.dequeue();

        que.enqueue(35);



    System.out.println(que);


    }
}



class ArrayQueue{


    int[] arr = new int[5]; // or create a constructor to find cap value

    private int first = 0;

    private int last = 0;

    private int count = 0;



    public void enqueue(int num){

        if (count == arr.length){
            throw new IllegalStateException();

        }


        arr[last] = num;
        last = (last + 1) % arr.length;
        count++;
        

    }

    public void dequeue(){


        arr[first] = 0;
        first = (first + 1) % arr.length;
        count--;

    }

    public int peek(){
        return arr[first];
    }

    public boolean isEmpty(){
        return (count!=0);
    }

    public boolean isFull(){
        return (count!=5);
    }

    @Override
    public String toString(){
        return Arrays.toString(arr);
    }


}