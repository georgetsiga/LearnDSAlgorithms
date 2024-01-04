package turin;

import java.util.Stack;

public class ProblemTwo {
    public static void main(String[] args) {
        ProblemTwo problemTwo = new ProblemTwo();
        System.out.println(problemTwo.isValid("(c(oder)) b(yte)"));
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                st.push(')');
            else if (s.charAt(i) == '{')
                st.push('}');
            else if (s.charAt(i) == '[')
                st.push(']');
            else if (st.isEmpty() || s.charAt(i) != st.peek())   //If stack is empty OR Top of stack != char, return false
                return false;
            else if (s.charAt(i) == st.peek())                 //Top of stack == char, then pop
                st.pop();
        }

        if (st.isEmpty())
            return true;
        return false;

    }
}
