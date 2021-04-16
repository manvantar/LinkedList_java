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

    /* This is method which adds the Nodes in between,
    @param prevINode this is used to indicate previousNode
    @param nextINode this is used to indicate nextNode
    @param newINode this node to be added between prevINode and nextINode
    */

    public void addInbetween(INode prevINode,INode newINode, INode nextINode){
        INode tempNode =this.head;
        while (tempNode.getNext() != null) {
            if(prevINode.getKey()==tempNode.getKey() && prevINode.getNext().getKey()==nextINode.getKey()){
                INode tempNode2=prevINode.getNext();
                prevINode.setNext(newINode);
                newINode.setNext(tempNode2);
            }
            else{
                tempNode = tempNode.getNext();
            }
        }
    }

    /* This method is used to delete the Node at first and
    @return DeletedNode
     */

    public INode pop(){
        INode tempINode=this.head;
        this.head=this.head.getNext();
        return tempINode;
    }

}
