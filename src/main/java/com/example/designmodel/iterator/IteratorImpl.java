package com.example.designmodel.iterator;

import java.util.List;

/**
 * @author xiongda
 * @ClassName IteratorImpl
 * @Description 迭代器实现
 * @createTime 2022-03-31 9:31
 */
public class IteratorImpl<E> implements Iterator<E>  {
    private List<E> list;
    private int cursor;
    private E element;
    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.println("当前位置"+cursor +" : ");
        element = list.get(cursor);
        cursor++;
        return element;
    }

    @Override
    public boolean hasNext() {
        if(cursor > list.size()-1){
            return false;
        }
        return true;
    }
}
