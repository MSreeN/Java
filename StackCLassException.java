public class StackCLassException {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        try {
        s.pop();
        } catch (UnderflowException e) {
            System.out.println(e);
        }
    }
}

class Stack {
    private int top = -1;
    private int[] stack;
    private int size;

    public Stack(int size) {
        this.size = size;
        stack = new int[this.size];
    }

    public void push(int x) throws StackOverflowException {
        if (top == size - 1)
            throw new StackOverflowException();
        stack[++top] = x;

    }

    public int pop() throws UnderflowException {
        if (top == -1)
            throw new UnderflowException();
        int del = stack[top];
        top--;
        return del;
    }
}

class StackOverflowException extends Exception {
    public String toString() {
        return "Stack is full";

    }
}

class UnderflowException extends Exception {
    // Underflow(){
    // toString();
    // }
    public String toString() {
        return "No elements in stack";
    }
}