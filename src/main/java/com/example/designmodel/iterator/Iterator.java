package com.example.designmodel.iterator;

/**
 * @author xiongda
 * @ClassName Iterator
 * @Description 迭代器
 * @createTime 2022-03-31 9:25
 */
public interface Iterator<E> {

    E next();

    boolean hasNext();

}
