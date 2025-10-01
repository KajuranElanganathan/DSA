import java.util.HashSet;
import java.util.Set;


//find first repeated char
public class Frc{
    public static void main(String[] args) {

        String str ="green apple";

        Set<Character> set = new HashSet<>();



        


    for (var ch: str.toCharArray()){

        if (set.contains(ch)){
            System.out.println(ch);
            }else{
                set.add(ch);
            }


    }

    








    }


}