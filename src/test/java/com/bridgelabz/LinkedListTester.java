package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTester {
    MyNode<Integer> node1 = new MyNode<>(30);
    MyNode<Integer> node2 = new MyNode<>(56);
    MyNode<Integer> node3 = new MyNode<>(70);

    @Test
    public void Testadd() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        String result = linkedList.printMyNodes();
        Assertions.assertEquals("70->56->30", result);
    }

    @Test
    public void testaddFirstAtFirst() {
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(node2);
        linkedList2.add(node1);
        linkedList2.add(node3);
        String result2 = linkedList2.printMyNodes();
        Assertions.assertEquals("56->30->70", result2);
    }

    @Test
    public void testaddInbetween(){
        LinkedList linkedList3=new LinkedList();
        linkedList3.add(node2);
        MyNode<Integer> node4=new MyNode<>(56);
        linkedList3.add(node4);
        linkedList3.add(node3);
        linkedList3.addInbetween(node4,node1,node3);
        String result3=linkedList3.printMyNodes();
        Assertions.assertEquals("56->56->30->70",result3);
    }

    @Test
    public void testPop(){
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(node1);
        linkedList2.add(node2);
        linkedList2.add(node3);
        INode result=linkedList2.pop();
        Assertions.assertEquals(node1,result);
    }

}
