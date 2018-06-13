package com.ancrazyking.datastructure.array;

/**
 * @author Ancrazyking
 * @date 2018/6/12 14:38
 **/
public class TestArray
{
    public static void main(String[] args){
        MyArray m=new MyArray();
        m.insert(100);
        m.insert(10);
        m.insert(20);
        m.display();
        System.out.println(m.search(20));
        System.out.println(m.getbyindex(0));
        m.delete(0);
        m.display();
    }


}
