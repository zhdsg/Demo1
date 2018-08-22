package com.zhanghao.test;

/**
 * Created by hasee on 2017/7/3.
 */


class StackByArray{
    private int[] stack ;
    private int top;
    public StackByArray (int stack_size){
        stack = new int[stack_size];
        top =-1;
    }

    public boolean push(int data){
        if (top>= stack.length){
            System.out.println("overout");
            return false;
        }else{
            stack[++top] =data;
            return true;
        }
    }

    public boolean empty(){
        if (top== -1)return true;
        else return false;
    }



}

public class CH04_01 {
}
