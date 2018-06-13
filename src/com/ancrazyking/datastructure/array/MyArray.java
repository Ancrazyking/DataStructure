package com.ancrazyking.datastructure.array;

/**
 * @author Ancrazyking
 * @date 2018/6/12 14:33
 **/
public class MyArray
{
    private Long[] arr;

    //表示有效数据的长度
    private int elements;

    /**
     * 默认构造的数组大小为50
     */
    public MyArray()
    {
        arr = new Long[50];
    }


    /**
     * 知道构造数组的大小
     *
     * @param size
     */
    public MyArray(int size)
    {
        arr = new Long[size];
    }

    /**
     * 添加数据
     *
     * @param value
     */
    public void insert(long value)
    {
        arr[elements] = value;
        elements++;
    }

    /**
     * 遍历数组
     */
    public void display()
    {
        System.out.print("[");
        for (int i = 0; i < elements - 1; i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[elements - 1]);
        System.out.print("]");
        System.out.println();
    }


    /**
     * 查找数据,返回数组的下标
     *
     * @param value
     * @return
     */
    public int search(long value)
    {
        int i;
        for (i = 0; i < elements; i++)
        {
            if (arr[i] == value)
            {
                return i;
            }
        }
        System.out.println("数组中不存在该值!");
        return -1;
    }


    /**
     * 根据索引查找数组的值
     *
     * @param index
     * @return
     */
    public long getbyindex(int index)
    {
        if (index >= elements || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            return arr[index];
        }
    }


    /**
     * 删除指定下标的数据
     *arr[i]=arr[i+1]
     * @param index
     */
    public void delete(int index)
    {
        if (index >= elements || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            for (int i = index; i < elements; i++)
            {
                arr[i] = arr[i+1];
            }
            elements--;
        }
    }


    /**
     * 改变数组中某个元素的值
     * @param index
     * @param value
     */
    public void change(int index, long value)
    {
        if (index >= elements || index < 0)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            arr[index]=value;
        }

    }

}
