package com.xuxi.queue;

public class ArrayQueue {
    public static void main(String[] args) {
        ArrayQueueTest arrayQueueTest = new ArrayQueueTest(3);
        arrayQueueTest.add(1);
        arrayQueueTest.add(2);
        arrayQueueTest.add(3);
        arrayQueueTest.show();
        System.out.println("队头为："+arrayQueueTest.headQueue());
//        arrayQueueTest.add(4);
    }
}
class ArrayQueueTest{
    private int maxSize;
    private int front; // 队列头
    private int rear;   // 队列尾
    private int[] arr;
    public ArrayQueueTest(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1; // 指向队列头部，分析出front是指向队列头的前一个位置
        rear = -1; // 指向队列尾，指向队列尾的数据(即就是队列最后一个数据)
    }
    public boolean isFull(){
        return rear == maxSize - 1;
    }
    public boolean isempty(){
        return rear == front;
    }
    public void add(int n){
        if(isFull()){
            System.out.println("队列已满");
            return ;
        }
        rear++;
        arr[rear] = n;
    }
    public int getQueue(){
        if(isempty()){
            throw new RuntimeException("队列为空，不能取数据");
        }
        front++;
        return arr[front];
    }
    public void show(){
        if(isempty()){
            System.out.println("队列为空");
            return ;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public int headQueue(){
        if(isempty()){
            throw new RuntimeException("队列为空，没有数据");
        }
        return arr[front+1];
    }

}
