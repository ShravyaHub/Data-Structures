import org.junit.Assert;
import org.junit.Test;

public class MyStackTest {

    @Test
    public void givenThreeNodes_WhenAddedToStack_ShouldReturnLastAddedNode() {
        MyNode myFirstNode = new MyNode<>(70);
        MyNode mySecondNode = new MyNode<>(30);
        MyNode myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode LastElement = myStack.peak();
        myStack.printStack();
        Assert.assertEquals(myThirdNode, LastElement);
    }
}