package com.huntech.springbootconcurrent01;

/**
 * @Desc
 * @Author remilia
 * @Create 2019-06-18
 */
public class MyWork implements Runnable {
    protected int countDown = 10;

    private static int taskCount = 0;
    //用于区分多个任务实例的id  初始化后禁止修改
    private final int id = taskCount++;

    public MyWork() {
    }

    public MyWork(int countDown) {
        this.countDown = countDown;
    }

    public String status(){
        return "#"+id+"("+(countDown>0 ? countDown :"over") + ")";
    }

    @Override
    public void run() {
        while(countDown -- > 0 ){
            System.out.println(status());
            Thread.yield();
        }
    }
}
