package com.zhanghao.test;

/**
 * Created by hasee on 2017/7/3.
 */

class Node{
    int data ;
    int np  ;
    String name;
    Node next ;
    public Node(int data ,String name ,int np){
        this.data =data;
        this.name =name;
        this.np =np;
    }

}
public class LinkList {
    private Node first ;
    private Node last;
    public boolean isEmpty(){
        return first == null ;
    }

    public void print(){
        Node current =first ;
        while(current != null){
            System.out.println("["+current.data+" "+current.name+" "+current.np+"]");
            current=current.next;
        }
        System.out.println();


    }
    public void insert(int data , String name,int np ){
        Node newNode =new Node(data, name, np);
        if(this.isEmpty()){
            first =newNode;
            last =newNode;
        }else{
            last.next=newNode;
            last=newNode;
        }

    }

    public static void main(String[] args) {
        LinkList list =new LinkList();
        list.insert(1,"1",1);
        list.insert(2,"1",1);
        list.insert(3,"1",1);
        list.insert(4,"1",1);
        list.insert(5,"1",1);
        list.print();


    }
}
