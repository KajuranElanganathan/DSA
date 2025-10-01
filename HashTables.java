import java.util.HashMap;
import java.util.Map;


//find the find first non repeating letter in a given string, 
public class HashTables{
    public static void main(String[] args) {
        



        Map<Integer, String> map = new HashMap<>();

        String str = "a green apple";

        var test = str.toCharArray();

        

        for (int i = 0; i <str.length(); i ++){
            
            map.add(test[i],i);


            

        }









        for (var item: map.entrySet()){

            System.out.println(item);
        }


        







    }
}
  
