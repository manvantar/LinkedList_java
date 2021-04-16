package com.bridgelabz;

public class LinkedList {
    public INode head;
    public INode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode newINode){
        if(this.tail==null){
            this.tail=newINode;
        }
        if(this.head==null){
            this.head=newINode;
        }
        else{
            INode tempNode=this.head;
            this.head=newINode;
            this.head.setNext(tempNode);
        }

    }
    public String printMyNodes() {
        String nodeslist="";
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            nodeslist=nodeslist+tempNode.getKey();
            if (!tempNode.equals(tail)) nodeslist=nodeslist+"->";
            tempNode = tempNode.getNext();
        }
        nodeslist=nodeslist+tempNode.getKey();
        System.out.println(nodeslist);
        return nodeslist;
    }

}
