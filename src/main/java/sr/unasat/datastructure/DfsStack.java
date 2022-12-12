package sr.unasat.datastructure;

// depth-first search (DFS)
// DFS is implemented with a stack(LIFO)
public class DfsStack {
    private final int SIZE = 15;//
    private int[] hubStack;
    private int top;

    public DfsStack(){
        hubStack = new int[SIZE];
        top = -1;

    }

    public void push(int item) {
        hubStack[++top] = item;
    }

    public int pop() {
        return hubStack[top--];
    }

    public int peek() {
        return hubStack[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

}
