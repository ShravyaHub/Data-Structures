import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest { 
    
    @Test
    public void givenThreeNodes_WhenAddedToQueue_ShouldReturnFirstAddedNode() {
        MyNode myFirstNode = new MyNode(56);
        MyNode mySecondNode = new MyNode(30);
        MyNode myThirdNode = new MyNode(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        Assert.assertEquals(myFirstNode, myQueue.peek());
    }

    @Test
    public void givenThreeNodes_WhenPopped_ShouldReturnFirstAddedNode() {
        MyNode myFirstNode = new MyNode(56);
        MyNode mySecondNode = new MyNode(30);
        MyNode myThirdNode = new MyNode(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        Assert.assertEquals(myFirstNode, myQueue.Dequeue());
    }

}