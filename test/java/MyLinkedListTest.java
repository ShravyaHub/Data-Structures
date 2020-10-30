import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void givenThreeNodes_WhenAddedToLinkedList_ShouldBeAddedToTop() {
        MyNode myFirstNode = new MyNode<>(70);
        MyNode mySecondNode = new MyNode<>(30);
        MyNode myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNodes_WhenAppendedToLinkedList_ShouldBeAddedToLast() {
        MyNode myFirstNode = new MyNode<>(70);
        MyNode mySecondNode = new MyNode<>(30);
        MyNode myThirdNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNodes_WhenInsertingSecondToLinkedList_ShouldReturnTrue() {
        MyNode myFirstNode = new MyNode<>(56);
        MyNode mySecondNode = new MyNode<>(30);
        MyNode myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNodes_WhenPoppedFirstNodeInLinkedList_ShouldReturnTrue() {
        MyNode myFirstNode = new MyNode<>(56);
        MyNode mySecondNode = new MyNode<>(30);
        MyNode myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.printMyNodes();
        myLinkedList.popFirst();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(mySecondNode) && myLinkedList.head.getNext().equals(myThirdNode) && myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNodes_WhenPoppedLastNodeInLinkedList_ShouldReturnTrue() {
        MyNode myFirstNode = new MyNode<>(56);
        MyNode mySecondNode = new MyNode<>(30);
        MyNode myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.printMyNodes();
        myLinkedList.popLast();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenThreeNodes_WhenSearchingNodeInLinkedList_ShouldReturnNode() {
        MyNode myFirstNode = new MyNode<>(56);
        MyNode mySecondNode = new MyNode<>(30);
        MyNode myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.printMyNodes();
        Assert.assertEquals(mySecondNode, myLinkedList.searchElement(30));
    }

    @Test
    public void givenFourNodes_WhenInsertingFourthNodeInBetweenSecondAndThird_ShouldReturnTrue() {
        MyNode myFirstNode = new MyNode(56);
        MyNode mySecondNode = new MyNode(30);
        MyNode myThirdNode = new MyNode(70);
        MyNode myFourthNode = new MyNode(40);
        MyLinkedList myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(mySecondNode, myFourthNode);
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.head.getNext().getNext().equals(myFourthNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNode_WhenDeleted_ShouldReturnTrue() {
        MyNode myFirstNode = new MyNode(56);
        MyNode mySecondNode = new MyNode(30);
        MyNode myThirdNode = new MyNode(40);
        MyNode myFourthNode = new MyNode(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.printMyNodes();
        myLinkedList.popNode(40);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFourthNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNode_WhenDeleted_ShouldReturnSize() {
        MyNode myFirstNode = new MyNode(56);
        MyNode mySecondNode = new MyNode(30);
        MyNode myThirdNode = new MyNode(40);
        MyNode myFourthNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList<>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.printMyNodes();
        myLinkedList.popNode(40);
        myLinkedList.printMyNodes();
        Assert.assertEquals(3, myLinkedList.size());
    }

}
