package com.laven.leetcode9;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12344321));
    }

    public static boolean isPalindrome(int x) {
        int originX = x;
        int rst=0;
        while(x!=0){
            rst= rst*10+ x%10;
            System.out.println("rst:" + rst);
            x=x/10;
            System.out.println("x:" + x);
        }
        if(rst == originX){
            return true;
        }else{
            return false;
        }
    }

}
