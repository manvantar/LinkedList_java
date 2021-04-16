package com.bridgelabz;

public class LinkedList {
    public INode head;
    public INode tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }


    /* This is method which adds the Nodes, if there is No nodes it will add it to first and make it
    as head and tail, later when the next node is added it added to the tails next and later it will be made as tail
    @param newINode of type INode
    */

    public void add(INode newINode){
        if(this.tail==null){
            this.tail=newINode;
        }
        if(this.head==null){
            this.head=newINode;
        }
        else{
            this.tail.setNext(newINode);
            this.tail=newINode;
        }

    }

    /* This method is used to append the string with the nodes and
    @return String this is appended string of total nodes
     */

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
