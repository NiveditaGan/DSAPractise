import java.util.Stack;

public class evalexp {
    public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub
        String s = "(2+)[{4}]";
        System.out.println(isBalanced(s));
    }
    private static boolean
    isBalanced(String s) throws Exception
    {
// TODO Auto-generated method stub
        Stack stack = new Stack();
        for (char c: s.toCharArray())
        {
            if (c == '(' || c == '{' || c
                    == '[')
                stack.push(c);

            if (c == ')' || c ==
                    '}' || c == ']')
            {
                Character top =
                        (char) stack.pop();
                if ((top == '(' &&
                        c != ')') || (top == '{' && c != '}')
                        || (top ==
                        '[' && c != ']')) {

                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}