package com.laven.leetcode14;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String strs[] = new String[3];
        strs[0] = "qwerty";
        strs[1] = "qwer";
        strs[2] = "qwe";
        System.out.println(longestCommonPrefix(strs));
    }

    /**
     * 我的算法
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        String commonStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String newCommonStr = "";
            for (int j = 0; j < commonStr.length() && j < strs[i].length(); j++) {
                if (commonStr.charAt(j) == strs[i].charAt(j)) {
                    newCommonStr += commonStr.charAt(j);
                } else {
                    break;
                }
            }
            commonStr = newCommonStr;
        }
        return commonStr;
    }

    /**
     * 高效算法
     * @param strs
     * @return
     */
    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String reg = strs[0];
        for (String str : strs) {
            while(!str.startsWith(reg)) {
                reg = reg.substring(0, reg.length() - 1);
                if (reg == "") {
                    return "";
                }
            }
        }

        return reg;
    }


}
