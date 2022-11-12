package recursion;

import java.util.Stack;

public class DecodeString {

    public static void main(String[] args) {
        String st = "3[a]2[bc]";
//        String st = "3[a2[cc]]";
//        System.out.println(decode(st));
        System.out.println(decodeSt(st));
    }

    private static String decode(String st) {
        int len = st.length();
        String res = "";
        for(int i = 0; i < len; i++) {
            int digit = 0;
            if(Character.isDigit(st.charAt(i))) {
                digit = st.charAt(i) - 48;

                if(st.charAt(i+1) == '[') {
                    int j = i+2;
                    String c = "";
                    while (st.charAt(j) != ']') {
                        c += st.charAt(j);
                        j++;
                    }
                    while (digit > 0) {
                        res += c;
                        digit--;
                    }

                    i = j;
                }
            }
            if(Character.isAlphabetic(st.charAt(i))) {
                res += st.charAt(i);
            }
        }
        return res;
    }

    private static String decodeSt(String st) {
        Stack<Character> stack = new Stack<>();
        int n = st.length();
        String res ="";

        for (int i = 0; i < n; i++) {

            if(Character.isDigit(st.charAt(i))) {
                stack.add(st.charAt(i));
            }
            if(Character.isAlphabetic(st.charAt(i))) {
                stack.add(st.charAt(i));
            }

            if(st.charAt(i) == ']') {
                StringBuilder s = new StringBuilder();
                while(Character.isAlphabetic(stack.peek())) {
                     s.append(stack.pop());
                }


                int k = stack.pop() - 48;

                s.reverse();
//                s.append(res); //acc
//                res = "";
                while (k-- != 0) res += s; // cc

            }
        }

        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()) s.append(stack.pop());

        s.reverse();
        return res+s;
    }
}
