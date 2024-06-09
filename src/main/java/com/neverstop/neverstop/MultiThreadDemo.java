package com.neverstop.neverstop;

public class MultiThreadDemo  extends Thread{

    public MultiThreadDemo(int threadCount) {
        this.threadCount = threadCount;
    }

    private int threadCount;


    @Override
    public  void  run() {

        for(int i = 0; i<=5;i++) {
            System.out.println(i +" from thread" + threadCount);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
