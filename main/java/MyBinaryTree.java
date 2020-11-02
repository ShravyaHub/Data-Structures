public class MyBinaryTree<K extends Comparable<K>> {

    private MyBinaryNode root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);
    }

    private MyBinaryNode addRecursively(MyBinaryNode<K> current, K key) {
        if(current == null)
            return new MyBinaryNode(key);
        int compareResult = key.compareTo(current.key);
        if(compareResult == 0) return current;
        if(compareResult < 0) {
            current.left = addRecursively(current.left, key);
        } else {
            current.right = addRecursively(current.right, key);
        }
        return current;
    }

    public int getSize() {
        return this.getSizeRecursive(root);
    }

    private int getSizeRecursive(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
    }

    public boolean search(K key) {
        return (searchRecursive(root, key) != null);
    }


    private MyBinaryNode<K> searchRecursive(MyBinaryNode<K> current, K key) {
        if (current == null)
            return null;
        else if (current.key.compareTo(key) < 0)
            return searchRecursive(current.right, key);
        else if (current.key.compareTo(key) < 0)
            return searchRecursive(current.left, key);
        else
            return current;

    }

}
