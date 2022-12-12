package sr.unasat.datastructure;

import sr.unasat.entity.Hubs;
import java.util.Arrays;

// book page 631
public class StackDisplayPath {
    private final int SIZE = 15;
    private Hubs[] hubStack;
    private int top;


    public StackDisplayPath(){
        hubStack = new Hubs[SIZE]; // make array
        top = -1;// initially the stack is empty and the top of the stack is set to -1. Then we initiate a "push" operation that is used to add an element to the stack
    }

    public void push(Hubs hubsStack) { hubStack[++top] = hubsStack;} // put item on stack

    public Hubs pop() {
        return hubStack[top--];
    } // take item off stack

    public Hubs peek() {
        return hubStack[top];
    } // peek at top of stack

    public boolean isEmpty() {
        return (top == -1);
    } // true if nothing on stack

    public void showStack() {
        System.out.println(Arrays.toString(hubStack));
    }

}
