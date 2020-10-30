public class MyQueue {
    private final MyLinkedList MyLinkedList;

    public MyQueue() {
        this.MyLinkedList = new MyLinkedList();
    }

    public void enqueue(INode newNode) {
        MyLinkedList.append(newNode);
    }

    public INode peek() {
        return MyLinkedList.head;
    }

    public void printQueue() {
        MyLinkedList.printMyNodes();
    }

}