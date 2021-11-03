package com.company;

public abstract class Bag<T> {
    public abstract void add(T newObj);
    public abstract void remove(T newObj);
    public abstract void removeAll();
}
