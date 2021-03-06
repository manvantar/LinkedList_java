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
    public void testPopFirst(){
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(node1);
        linkedList2.add(node2);
        linkedList2.add(node3);
        INode result=linkedList2.popFirst();
        Assertions.assertEquals(node1,result);
    }

    @Test
    public void testPopLast(){
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(node1);
        linkedList2.add(node2);
        linkedList2.add(node3);
        INode result=linkedList2.popLast();
        Assertions.assertEquals(node3,result);
    }

    @Test
    public void testSearchNode(){
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(node1);
        linkedList2.add(node2);
        linkedList2.add(node3);
        INode<Integer> node4=new MyNode<>(40);
        boolean result=linkedList2.searchNode(node2);
        boolean result1= linkedList2.searchNode(node4);
        Assertions.assertEquals(true,result);
        Assertions.assertEquals(false,result1);
    }

    @Test
    public void testaddAfter(){
        LinkedList linkedList3=new LinkedList();
        linkedList3.add(node2);
        linkedList3.add(node1);
        linkedList3.add(node3);
        MyNode<Integer> node4=new MyNode<>(40);
        linkedList3.addAfter(node2,node4);
        String result3=linkedList3.printMyNodes();
        Assertions.assertEquals("56->40->30->70",result3);
    }

    @Test
    public void testDeleteInbetween_and_test_size(){
        LinkedList linkedList2 = new LinkedList();
        linkedList2.add(node1);
        linkedList2.add(node2);
        linkedList2.add(node3);
        boolean result=linkedList2.deleteNodeBetween(node2);
        Assertions.assertEquals(true,result);
        linkedList2.printMyNodes();
        int size=linkedList2.sizeOfLinkedList();
        Assertions.assertEquals(2,size);
    }

}
