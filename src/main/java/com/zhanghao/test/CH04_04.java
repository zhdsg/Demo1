package com.zhanghao.test;

/**
 * Created by hasee on 2017/7/3.
 */
public class CH04_04 {

    public static void main(String[] args) {
        int j =4;
        hanio(j,1,2,3);
    }


    public static void hanio(int n,int p1,int p2,int p3){
        if (n==1){
            System.out.println(n+" "+"p"+p1+"-->"+"p"+p3);
        }else{
            hanio(n-1,p1,p3,p2);
            System.out.println(n+" "+"p"+p1+"-->"+"p"+p3);
            hanio(n-1,p2,p1,p3);
        }
    }
}
