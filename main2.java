
import java.util.NoSuchElementException;

public class main2{
    public static void main(String[] args){

    LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        int size = list.size();

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


        var current = first;


        while(current!= null){


            
        }












    }











}