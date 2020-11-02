import java.util.ArrayList;

public class MyLinkedHashMap<K extends Comparable, V> {

    private final int numBuckets;
    ArrayList<MyLinkedList> myBucketArray;

    public MyLinkedHashMap() {
        this.numBuckets = 10;
        this.myBucketArray = new ArrayList<>(numBuckets);
        for(int index = 0; index < numBuckets; index++) {
            this.myBucketArray.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % numBuckets;
        System.out.println("Key: " + key + " Hashcode: " + hashCode + "Index: " + index);
        return  index;
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        MyLinkedList myLinkedList = this.myBucketArray.get(index);
        if(myLinkedList == null) return null;
        MyMapNode<K, V> myMapNode = (MyMapNode) myLinkedList.searchElement(key);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        MyLinkedList myLinkedList = this.myBucketArray.get(index);
        if(myLinkedList == null) {
            myLinkedList = new MyLinkedList();
            this.myBucketArray.set(index, myLinkedList);
        }
        MyMapNode myMapNode = (MyMapNode) myLinkedList.searchElement(key);
        if(myMapNode == null) {
            myMapNode = new MyMapNode(key, value);
            myLinkedList.append(myMapNode);
        } else {
            myMapNode.setValue(value);
        }

    }

    public void remove(K key) {
        int index = this.getBucketIndex(key);
        MyLinkedList myLinkedList = this.myBucketArray.get(index);
        INode<K> tempNode = myLinkedList.searchElement(key);
        myLinkedList.pop(tempNode);
    }
}
