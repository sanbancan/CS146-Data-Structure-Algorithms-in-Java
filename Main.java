//Implement the static method match() in that takes a string s as argument and uses a stack to determine whether its parentheses are properly balanced, and returns true if they are and false otherwise. You may assume that s only consists of parentheses (curly, square, and round)


import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(match("{}"));
    }

    public static Boolean match(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x == '(' || x == '{' || x == '[') {
                stk.push(x);
                continue;
            }
            if (stk.isEmpty())
                return false;
            char top = stk.pop();
            switch (x) {
                case ')':
                    if (top != '(')
                        return false;
                    break;
                case '}':
                    if (top != '{')
                        return false;
                    break;
                case ']':
                    if (top != '[')
                        return false;
                    break;
            }
        }
        return stk.isEmpty();
    }
}
