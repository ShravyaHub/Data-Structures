public class MyBinaryNode<K extends Comparable<K>> {

    K key;
    MyBinaryNode left;
    MyBinaryNode right;

    public MyBinaryNode(K key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }

}
