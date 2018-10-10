import java.util.Stack;

/**
 * Created by Tal on 7/11/2018.
 */
public class ParseParentesis {
    public static void main(String[] args){
        System.out.println(parseParentesis("(3+5)*"));
    }

    private static boolean parseParentesis(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        for (char c:arr) {
            if(c != ')'){
                stack.push(c);
            }
            else{
                if(Character.isDigit(stack.pop()) && isOperand(stack.pop()) && Character.isDigit(stack.pop())){
                    stack.pop();
                }
                else
                    return false;
            }
        }

        return true;
    }

    private static boolean isOperand(Character c) {
        if(c == '+' || c == '-' || c == '*' || c == '/' || c == '%')
            return true;
        return false;
    }
}
