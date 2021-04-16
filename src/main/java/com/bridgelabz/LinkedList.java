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

    public void add(INode newINode) {
        if (this.tail == null) {
            this.tail = newINode;
        }
        if (this.head == null) {
            this.head = newINode;
        } else {
            this.tail.setNext(newINode);
            this.tail = newINode;
        }
    }

    /* This method is used to append the string with the nodes and
    @return String this is appended string of total nodes
     */

    public String printMyNodes() {
        String nodeslist = "";
        INode tempINode = head;
        while (tempINode.getNext() != null) {
            nodeslist = nodeslist + tempINode.getKey();
            if (!tempINode.equals(tail)) nodeslist = nodeslist + "->";
            tempINode = tempINode.getNext();
        }
        nodeslist = nodeslist + tempINode.getKey();
        System.out.println(nodeslist);
        return nodeslist;
    }

    /* This is method which adds the Nodes in between,
    @param prevINode this is used to indicate previousNode
    @param nextINode this is used to indicate nextNode
    @param newINode this node to be added between prevINode and nextINode
    */

    public void addInbetween(INode prevINode, INode newINode, INode nextINode) {
        INode tempINode = this.head;
        while (tempINode.getNext() != null) {
            if (prevINode.getKey() == tempINode.getKey() && prevINode.getNext().getKey() == nextINode.getKey()) {
                INode tempINode2 = prevINode.getNext();
                prevINode.setNext(newINode);
                newINode.setNext(tempINode2);
            } else {
                tempINode = tempINode.getNext();
            }
        }
    }

    /* This method is used to delete the Node at first and
    @return DeletedNode
     */

    public INode popFirst() {
        INode tempINode = this.head;
        this.head = this.head.getNext();
        return tempINode;
    }

    /* This method is used to delete the Node at end and
    @return DeletedNode
     */

    public INode popLast() {
        INode tempINode = this.head;
        while (!tempINode.getNext().equals(this.tail)) {
            tempINode = tempINode.getNext();
        }
        this.tail = tempINode;
        tempINode = tempINode.getNext();
        return tempINode;
    }

    /* This method is used to search the Node and
    @return boolean value
     */
    public boolean searchNode(INode value) {
        INode tempINode = this.head;
        while (tempINode != null) {
            if (value.getKey().equals(tempINode.getKey())) {
                return true;
            }
            tempINode=tempINode.getNext();
        }
        return false;
    }

    /* This method is used to search the Node and add the new node next to it
   @return boolean value
    */
    public void addAfter(INode prevINode, INode newINode) {
        INode tempINode = this.head;
        int found=0;
        while (tempINode.getNext() != null && found==0) {
            if (prevINode.getKey() == tempINode.getKey()) {
                INode tempINode2 = prevINode.getNext();
                prevINode.setNext(newINode);
                newINode.setNext(tempINode2);
                found=1;
            } else {
                tempINode = tempINode.getNext();
            }
        }
    }

}
