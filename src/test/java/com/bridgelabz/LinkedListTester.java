package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTester {

    @Test
    public void Testadd(){
        MyNode<Integer> node1=new MyNode<>(30);
        MyNode<Integer> node2=new MyNode<>(56);
        MyNode<Integer> node3=new MyNode<>(70);
        LinkedList linkedList=new LinkedList();
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        String result=linkedList.printMyNodes();
        Assertions.assertEquals("70->56->30",result);
    }

}
