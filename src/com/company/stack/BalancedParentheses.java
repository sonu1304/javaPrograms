package com.company.stack;

import java.util.Stack;

public class BalancedParentheses {


    public boolean isBalanced(String parentheses) {

        //crating empty stack

        Stack<Character> stack = new Stack<>();

        for ( char c : parentheses.toCharArray()) {

            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                /**
                 * check for stack , if it is empty then return false
                 * because it means there is a opposite bracket at the starting of the string
                 */
                if(stack.isEmpty()) return false;

                // pop out the first element from the stack

                char bracket = stack.pop();

                if((c == ')' && bracket == '(') || (c == '}' && bracket == '{')
                        || (c == ']' && bracket == '['));
                else return false;

            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        BalancedParentheses check = new BalancedParentheses();

        String parentheses = "{}()[]";

        System.out.print(check.isBalanced(parentheses));
    }
}
