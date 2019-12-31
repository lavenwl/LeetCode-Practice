package com.laven.leetcode7;

public class ReversInterger {
    public static void main(String[] args) {
        System.out.println(reverse(123456));

//        int max = 0x7fffffff, min = 0x80000000;//int的最大值最小值
//        System.out.println(max);
//        System.out.println(min);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
    }

    static int reverse(int x)
    {
        long rst=0;
        while(x!=0){
            rst= rst*10+ x%10;
            System.out.println("rst:" + rst);
            x=x/10;
            System.out.println("x:" + x);
        }
        if((int)rst!=rst){
            return 0;
        }else{
            return (int)rst;
        }
    }
}
