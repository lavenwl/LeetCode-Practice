package com.laven.leetcode20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ValidParentheses {
    public static void main(String[] args) {

        System.out.println(isValid("()()()"));
    }

    /**
     * 我的算法
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        LinkedList<Character> list = new LinkedList<Character>();
        for (char c : s.toCharArray()) {
            if (list.size() == 0) {
                list.add(c);
            } else {
                if (match(list.getLast(), c)) {
                    list.removeLast();
                } else {
                    list.add(c);
                }
            }

            System.out.println(list);
        }
        return list.size() == 0;
    }

    public static boolean match(char a, char b) {
        if (a == '(' && b == ')') {
            return true;
        }
        if (a == ')' && b == '(') {
            return true;
        }
        if (a == '[' && b == ']') {
            return true;
        }
        if (a == ']' && b == '[') {
            return true;
        }
        if (a == '{' && b == '}') {
            return true;
        }
        if (a == '}' && b == '{') {
            return true;
        }
        return false;
    }

    /**
     * 高效算法
     * @param s
     * @return
     */
    public static boolean isValid2(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        char charArray[] = s.toCharArray();


        return false;
    }
}
