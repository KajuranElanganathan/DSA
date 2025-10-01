
import java.util.PriorityQueue;

public class PriorityQueues{
    public static void main(String[] args) {
        
        // how we create it normallyPriorityQueue<Integer> queue = new PriorityQueue<>();
        //below is a self implementation with arrays


       




    }
}


class PriorityQueue{


    private int[] items = new int[5];
    private int count;


    public void add(int item){

        if (count == items.length){
            throw new IllegalStateException();
        }

        int i;

        for ( i = count-1; i >= 0; i --){

            if (items[i]>item)
            {
                items[i+1]=items[i];            
            }else{
                break;
            }
     }
         items[i+1] = item;
         count++;

    }

    public int remove(){

        if (count == 0){
            throw new IllegalStateException();
        }

        count--;
        return items[count];







    }












}