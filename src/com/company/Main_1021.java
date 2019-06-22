package com.company;

import java.util.Deque;
import java.util.LinkedList;

public class Main_1021 {
    public String removeOuterParentheses(String S) {
        Deque<Character> stack = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                stack.push('(');
                if (stack.size() > 1)
                    sb.append('(');
            } else {
                if (stack.size() > 1) {
                    sb.append(')');
                }
                stack.poll();
            }
        }

        return sb.toString();
    }
}
