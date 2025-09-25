import java.util.Stack;
import java.lang.StringBuffer;

public class stacks{
    public static void main(String[] args) {
        
    String str = "abc";
    String y ="";
    int j = 1;
    Stack<String> x = new Stack<>();


    for (int i = 0; i < str.length(); i ++ ) {

        x.push(str.substring(i,j));
        j++;


    }

    StringBuffer reversed = new StringBuffer();

    while (!x.isEmpty()){
        reversed.append(x.pop());
    }

    System.out.println(reversed);




    }

}