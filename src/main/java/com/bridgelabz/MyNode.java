package com.bridgelabz;

public class MyNode<K> implements INode<K>{
    public INode next;
    public K key;

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setKey(K key) {
        this.key=key;
    }

    @Override
    public INode getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next=next;
    }
}
