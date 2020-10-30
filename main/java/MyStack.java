public class MyStack<K extends Comparable<K>> {

    private final MyLinkedList<K> myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedList();
    }

    public void push(INode newNode) {
        myLinkedList.add(newNode);
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.popFirst();
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }

}