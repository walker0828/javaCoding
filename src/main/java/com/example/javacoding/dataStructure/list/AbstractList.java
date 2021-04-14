package com.example.javacoding.dataStructure.list;

public abstract class AbstractList<E> implements List<E>{
    protected int size;

    public boolean isEmpty() {
        return size == 0;
    }

}
