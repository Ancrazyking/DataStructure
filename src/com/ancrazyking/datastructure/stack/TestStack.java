package com.ancrazyking.datastructure.stack;

/**
 * @author Ancrazyking
 * @date 2018/6/13 9:20
 **/
public class TestStack
{
    public static void main(String[] args){
        MyStack myStack=new MyStack(50);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println(myStack.peek());//30
        myStack.pop();
        myStack.pop();
        System.out.println(myStack.peek());//10





    }
}
