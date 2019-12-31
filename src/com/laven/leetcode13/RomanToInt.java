package com.laven.leetcode13;

import java.util.HashMap;

public class RomanToInt {
    public static void main(String[] args) {
//        System.out.println(romanToInt("MCMXCIV")); // 1994
        System.out.println(romanToInt2("MDCXCV")); // 1695
    }


    /**
     * 我的算法
     * @param s
     * @return
     */
    public static int romanToInt2(String s) {
        HashMap<String, Integer> resMap = new HashMap<String, Integer>();
        // 正常情况
        resMap.put("I", 1);
        resMap.put("V", 5);
        resMap.put("X", 10);
        resMap.put("L", 50);
        resMap.put("C", 100);
        resMap.put("D", 500);
        resMap.put("M", 1000);
        // 特殊情况
        resMap.put("IV", 4);
        resMap.put("IX", 9);
        resMap.put("XL", 40);
        resMap.put("XC", 90);
        resMap.put("CD", 400);
        resMap.put("CM", 900);

        if (resMap.containsKey(s)) {
            return resMap.get(s);
        }

        char[] charArray = s.toCharArray();

        int res = 0;
        try {
            for (int i = 1; i < charArray.length; i++) {
                String ss = String.valueOf(charArray[i - 1]) + String.valueOf(charArray[i]);
                if (resMap.containsKey(ss)) {
                    System.out.println(ss);
                    res = res + resMap.get(ss);
                    i++;
                } else {
                    res = res + resMap.get(String.valueOf(charArray[i - 1]));
                }
                if (i == (charArray.length - 1)) {
                    res = res + resMap.get(String.valueOf(charArray[i]));
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return res;
    }


    private static int getNum(char c) {
        int res = 0;
        switch (c) {
            case 'I':
                res = 1;
                break;
            case 'V':
                res = 5;
                break;
            case 'X':
                res = 10;
                break;
            case 'L':
                res = 50;
                break;
            case 'C':
                res = 100;
                break;
            case 'D':
                res = 500;
                break;
            case 'M':
                res = 1000;
                break;
            default:
                res = -1;
        }
        return res;
    }

    /**
     * 高效算法
     * @param s
     * @return
     */
    public static int romanToInt(String s){
        if (null == s || s.length() == 0) {
            return 0;
        }

        int res = 0;
        int pre = 0;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            int cur = getNum(s.charAt(i));
            if (cur >= pre) {
                res += cur;
            }
            else {
                res -= cur;
            }
            pre = cur;
        }
        return res;
    }
}
