package com.ancrazyking.datastructure.queue;

/**
 * @author Ancrazyking
 * @date 2018/6/13 9:43
 **/
public class MyQueue
{
    //底层也是使用数组
    private Long[] arr;
    //有效数据的大小
    private int elements;
    //队头
    private int font;
    //队尾
    private int rear;

    /**
     * 默认构造函数,大小为10
     * 有效数据0个
     * 头指针为0
     * 尾指针为-1
     */
    public MyQueue(){
        arr=new Long[10];
        elements=0;
        font=0;
        rear=-1;
    }


    /**
     * 插入元素,从队尾rear插入
     * @param value
     */
    public void  insert(long value){
        arr[++rear]=value;
        elements++;
    }

    /**
     * 删除元素,从队头删除
     * @return
     */
    public long remove(){
        elements--;
        return arr[font++];
    }

    /**
     * 查看数据,从对头查看
     * @return
     */
    public long peek(){
        return arr[font];
    }

    /**
     * 查看队列是否已满
     * @return
     */
    public boolean isEmpty(){
        return elements==0;
    }

    /**
     * 查看队列是否为空
     * @return
     */
    public boolean isFull(){
        return elements==arr.length;
    }


}

