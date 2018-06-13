package com.ancrazyking.datastructure.stack;

/**
 * @author Ancrazyking
 * @date 2018/6/13 9:09
 **/
public class MyStack
{
    /**
        栈的底层实现是一个数组
        top代表栈顶指针
     */
    private Long[] arr;
    private int top;

    /**
     * 指定数组的初始化大小
     * @param maxsize
     */
    public MyStack(int maxsize){
        arr=new Long[maxsize];
        top=-1;
    }

    /**
     * 添加数据,压栈
     * @param value
     */
    public void push(long value){
        arr[++top]=value;
    }

    /**
     * 出栈,删除数据
     * @return
     */
    public long pop(){
        return arr[top--];
    }

    /**
     * 查看数据,栈顶数据
     */
    public long peek(){
        return arr[top];
    }

    /**
     * 如果栈顶top指向-1,则表明为空
     * @return
     */
    public boolean isEmpty(){
        return top==-1;
    }

    /**
     * 如果指针执行数组的最大个数
     * @return
     */
     public boolean isFull(){
        return top==arr.length-1;
     }

}
