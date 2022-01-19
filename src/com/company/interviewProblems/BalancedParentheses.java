package com.company.interviewProblems;

import java.util.Stack;

public class BalancedParentheses {

    public boolean checkBalance(String brackets) {

        Stack<Character> stack = new Stack<>();


        for (char c : brackets.toCharArray()) {


            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;

        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        BalancedParentheses balancedParentheses = new BalancedParentheses();

        String expr = "({}[])";
        System.out.print(balancedParentheses.checkBalance(expr));
    }
}
