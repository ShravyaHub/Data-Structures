public class MyStack<K extends Comparable<K>> {

    private final MyLinkedList<K> myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList<K>();
    }

    public void push(INode<K> newNode) {
        myLinkedList.add(newNode);
    }

    public INode<K> peak() {
        return myLinkedList.head;
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }
}