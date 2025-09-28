//interview question about the validating arithmetic expression, ensuring there is an opened and closing bracket.

import java.util.Stack;

public class StacksExpression{
    public static void main(String[] args) {
        

        String str = "(<>)";

        boolean hello = stackproblem.check(str);

        System.out.println(hello);


        



}

class stackproblem{

    public static boolean check(String str){

        Stack<Character> stack = new Stack<>();

        for(char ch: str.toCharArray()){

            if(ch == '('){
                stack.push(ch);

            }

            if (ch == '('){
                if(stack.isEmpty())return false;
                stack.pop();
            }


        }

        return stack.empty();


    }





    }












}