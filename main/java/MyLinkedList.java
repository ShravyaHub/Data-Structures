public class MyLinkedList<K extends Comparable<K>> {

    INode tail;
    INode head;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(MyNode newNode) {
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode myNode) {
        if(this.head == null) {
            this.head = myNode;
        }
        if(this.tail == null) {
            this.tail = myNode;
        } else {
            this.tail.setNext(myNode);
            this.tail = myNode;
        }
    }

    public void insert(INode myNode, INode newNode) {
        INode tempNode = myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode popFirst() {
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }
    
    public INode popLast() {
        INode tempNode = head;
        while(!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    public INode searchElement(K key){
        INode tempNode = head;
        while (tempNode.getNext() != null && tempNode != null){
            if(tempNode.getKey().equals(key)){
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    public INode popNode(K key) {
        INode prevNode = null;
        INode tempNode = head;
        while (tempNode.getNext()!=null){
            if(tempNode.getKey().equals(key)){
                prevNode.setNext(tempNode.getNext());
                return tempNode;
            }
            prevNode = tempNode;
            tempNode = tempNode.getNext();
        }
        return tempNode;
    }

    public int size(){
        int size = 0;
        INode tempNode = head;
        while (tempNode!=null){
            size++;
            tempNode = tempNode.getNext();
        }
        return size;
    }

    public void addElementInSortedList(INode<K> newNode) {
        INode<K> tempNode = head;
        INode<K> prevNode = null;
        while (tempNode != null && newNode.getKey().compareTo(tempNode.getKey()) > 0) {
            prevNode = tempNode;
            tempNode = tempNode.getNext();
        }
        if (prevNode == null) {
            this.head = newNode;
        } else {
            prevNode.setNext(newNode);
        }
        newNode.setNext(tempNode);
        while (tempNode!=null){
            this.tail = tempNode;
            tempNode = tempNode.getNext();
        }
    }

    public void printMyNodes() {
        StringBuffer myNodes = new StringBuffer("My nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) {
                myNodes.append(" -> ");
            }
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
