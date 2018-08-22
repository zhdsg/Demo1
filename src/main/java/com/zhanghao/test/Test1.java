package com.zhanghao.test;

/**
 * Created by hasee on 2017/6/26.
 */
public class Test1  {

     static class Thread1 extends Thread{
        private String threadName ;

        public Thread1(String threadName){
            this.threadName =threadName;
        }


        @Override
        public void run() {

            for(int i = 0; i < 5 ;i++){
                System.out.println(threadName+" : "+ i);
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    public static void main(String[] args) {
        Thread1 t1 =new Thread1("A");
        Thread1 t2 = new Thread1("B");
        t1.start();
        t2.start();

    }

}
