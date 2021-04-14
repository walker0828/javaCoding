package com.example.javacoding.dataStructure.list;

public interface List<E> {
    /**
     * 末尾添加元素
     * @param e
     *
     */
    void add(E e);
    /**
     * 索引处添加元素
     * @param index
     * @param e
     */
    void insert(int index, E e);

    /**
     * 移除索引处元素
     * @param index
     */
    E remove(int index);

    E set(int index,E e);

    E get(int index);

    int indexOf(E e);

    int size();
}
