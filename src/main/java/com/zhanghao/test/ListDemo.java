package com.zhanghao.test;

import java.util.LinkedList;
import java.util.concurrent.locks.Lock;

/**
 * Created by Administrator on 2018/11/22/022.
 */
public class ListDemo {

    class Node {
        private Node next ;
        private int data ;

        public Node getNext() {
            return next;
        }
        public boolean hasNext(){
            return next!=null;
        }
        public void setNext(Node next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
    private Node first ;
    private Node last;

    public synchronized int add(int data ){
       Node current =first ;
        while(current.hasNext()){
            current = current.next;
        }
        Node node =new Node();
        current.setNext(node);
        current.setData(data);
        return data;
    }

    public static void main(String[] args){

    }

}
