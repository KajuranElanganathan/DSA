import java.util.ArrayList;


public class customDynamicArrays {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);

    


        numbers.print();
        System.out.println(numbers.reverse());


    }
}

class Array{ 

    private int[] items;
    private int count;
    

    public Array(int length){

        items = new int[length]; 

    }

    public void print(){

        for(int i = 0;i<count;i++){
            System.out.println(items[i]);
        }

    }

    public void insert(int item){
        //if the array if full we must resize it
        if (items.length == count){

            //create a new array (twice the size)
            int [] newItems = new int[count * 2];

            //copy all the items

            for (int i = 0; i < count; i ++){

                newItems[i] = items[i];

            }

            items = newItems;


        }


        //append new item to the end of the array
        items[count] = item;
        count++;




    }

    public void removeAt(int index){


        if (index < 0  || index >= count){

            throw new IllegalArgumentException();
             
        } 

        for (int i = index; i < count; i ++){

            items[i] = items[i+1];

        }

        
        count --;




    }

    public int indexOf(int item){

        for (int i =0; i < count; i ++){

            if (items[i]==item){
                return i;
            }


        }
        return -1;


    }

    public int largestnum(){

        int temp = items[0];

        for (int i = 1; i < count; i ++){


            if (temp < items[i]){
                
                temp = items[i];

            }


        }
        
        return temp;



    }

    public ArrayList intersect(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();


        for (int i = 0; i < count; i++){
            for (int y = 0; y < arr.length; y++){

                if (items[i] == arr[y]){
                
                System.out.println("tick");

                list.add(items[i]);


                }





            }


        }

        

    return list;


    }

    public ArrayList reverse(){
        
        ArrayList<Integer> x = new ArrayList<>();

        for (int i = count - 1; i > -1; i--){

            x.add(items[i]);
        }

        return x;



    }



    public int[] extend(int index,int value){



            items[index]=value;




    }




















}
