package com.ancrazyking.datastructure.queue;

/**
 * @author Ancrazyking
 * @date 2018/6/13 9:56
 **/
public class TestMyQueue
{
    public static void main(String[] args)
    {
        MyQueue myQueue = new MyQueue();
        for (long i = 0; i < 10; i++)
        {
            myQueue.insert(i);
        }
        System.out.println(myQueue.peek());
    }


}
