public class MyQueue {
    private final MyLinkedList myLinkedList;

    public MyQueue() {
        this.myLinkedList = new MyLinkedList();
    }

    public void enqueue(INode newNode) {
        myLinkedList.append(newNode);
    }

    public INode peek() {
        return myLinkedList.head;
    }

    public void printQueue() {
        myLinkedList.printMyNodes();
    }

    public INode Dequeue() {
        return myLinkedList.popFirst();
    }

}