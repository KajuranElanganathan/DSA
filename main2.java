
import java.util.Arrays;
import java.util.NoSuchElementException;

public class main2{
    public static void main(String[] args){

    LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.reverse();

        var array = list.arr();

        System.out.println(Arrays.toString(array));

    }

}


class LinkedList{

    private class Node{

    private int value;
    private Node next;

    public Node(int value){
        this.value = value;
    }


}


    private Node first;
    private Node last;


    public void addLast(int item){

        Node node = new Node(item);


        if (first == null){

            first = node;
            last = node;
        }
        else{

            last.next = node;
            last = node;


        }



    }

    private boolean isEmpty(){
        return first == null;
    }





    public void addFirst(int item){


        Node node = new Node(item);

        if (isEmpty()){

            first = node;
            last = node;

        }else{


        node.next = first;
        first = node;



        }
    }

    

    public int indexOf(int item){

        int index = 0;
        var current = first;// a variable that represents the first node a

        while(current != null){ // as long as the node exists

            if(current.value == item){ // if the value of the node is correct return
                return index;
            }
            current = current.next;// because current points to a node in memory, the next property points to the next node, so it will go to the next node
            index++; //index increments to mimic an array like structure.


        }
        return -1;

    }

    public boolean contains(int value){

        var current = first;

        while(current != null){

            if (current.value == value){
                return true;
            }

            current = current.next;

        }


        return false;

    }

    public void removeFirst(){


        if (first == null){

            throw new NoSuchElementException();
        }

        if (first == last){
            first = last = null;
            return;
        }


        var second = first.next;

        first.next = null; //must remove for memory or else JGC will recognize it


        first = second;

    }


    public void removeLast(){


        if (first == null){

            throw new NoSuchElementException();
        }

        if (first == last){
            first = last = null;
            return;
        }



        var current = first;

        while(current!= null){
            if(current.next == last){
                break;
            }
            current = current.next;


        }
        var previous = current;

        last = previous;

        last.next = null; // must delete this last link which was prev exisiting 

    }

    public int size(){


        var current = first;
        int size = 0;

        while(current != null){

            size++;
            current = current.next;




        }

    return size;



    }

    public int[] arr(){

        var current = first;
        int size = 0;

        while(current != null){

            size++;
            current = current.next;




        }

        
        int[] arr = new int[size];

        current = first;
        int index = 0;
        while(current!= null){

            arr[index] = current.value;
            index++;
            current = current.next;



        }



    return arr;
    }



    public void reverse(){


        //need a previous and current and next, [10(p) <- 20(c) -> 30(n)]

        var previous = first; //marks the first node as previous
        var current = first.next; //marks the 2nd to first node as current

        

        while(current!=null){ //as long as the current node isnt nulls which is when [10<-20<-30(p)] c , after all the arrows get reversed.


            var next = current.next; //set the 3rd node to next, to allow us to hold a reference when we switch the arrow
            current.next = previous; //sets the 2nd node link to first
            previous = current; //shift the previous to next node
            current = next; //shift current to next node

        }

        last = first; // last point is set to the first pointer
        last.next = null; // the pointer that was still technically still here, is set to null, when [10->20] becomes [10 <- 20] the inital arrow is gone
        first = previous; //first pointer set to the new first node








    }











}