public class MyNode<E> {

    E key;
    MyNode next;

    public MyNode(E key) {
        this.key = null;
        this.next = null;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

}
